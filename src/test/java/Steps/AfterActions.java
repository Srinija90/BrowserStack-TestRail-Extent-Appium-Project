package Steps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import ExtentListeners.ExtentManager;
import ExtentListeners.ExtentTestManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import testrailclient.APIClient;
import testrailclient.APIException;
import testrailclient.TestRailClient;
import testrailclient.TestRailUtil;
import Base.BaseTest;
import Browserstack.BrowserstackUtil;

import java.util.regex.Pattern;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class AfterActions extends BaseTest {

    private static void updateTestrail(Scenario scenario, String screenshotPath)
            throws MalformedURLException, IOException, APIException {
        final String testRailRunId = System.getProperty("testrailrunid");
        final String testRailCaseId = TestRailUtil.getTestRailCaseId(scenario.getSourceTagNames());
        String browserStackSessionURL = BrowserstackUtil.getSessionURL(driver);

        if (testRailRunId != null && testRailCaseId != null) {
            System.out.println("Testrail RunId: " + testRailRunId);
            System.out.println("Testrail Caseid: " + testRailCaseId);

            Integer statusId = TestRailUtil.getTestRailStatus(scenario.getStatus());
            System.out.println("Update scenario: '" + scenario.getName() + "' on Testrail with status: " + statusId);

            Map data = new HashMap();
            data.put("status_id", statusId);
            if (scenario.isFailed()) {
                data.put("comment", "CI Run: Test failed. Session URL: " + browserStackSessionURL);
            } else {
                data.put("comment", "CI Run: Test successes. Session URL: " + browserStackSessionURL);
            }

            APIClient apiClient = TestRailClient.getClient();
            JSONObject r = (JSONObject) apiClient
                    .sendPost("add_result_for_case/" + testRailRunId + "/" + testRailCaseId, data);
            System.out.println("Successfully added Testrail result. ResultId: " + r.get("id"));

            if (scenario.isFailed() && !screenshotPath.equals("")) {
                System.out.println("screenshotPath" + screenshotPath);
                JSONObject r1 = (JSONObject) apiClient.sendPost(
                        "add_attachment_to_result_for_case/" + r.get("id") + "/" + testRailCaseId, screenshotPath);

                System.out.println(r1.toString());
            }
        }
    }

    private static String saveScreenshot(Scenario scenario) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        String screenshotPath = System.getProperty("user.dir") + "/reports/screenshots_"
                + d.toString().replace(":", "_").replace(" ", "_") + "/" + scenario.getId() + ".png";
        File destination = new File(screenshotPath);

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            System.out.println("Capture Failed " + e.getMessage());
        }
        return screenshotPath;
    }

    @After
    public void after(Scenario scenario) throws IOException, APIException {
        final String environment = System.getProperty("env");

        String screenshotPath = "";
        if (scenario.isFailed()) {
            screenshotPath = saveScreenshot(scenario);

            ExtentTestManager.addScreenShotsOnFailure(screenshotPath);
        } else {
            ExtentTestManager.scenarioPass();
        }

        try {
            updateTestrail(scenario, screenshotPath);
        } catch (Exception e) {
            System.out.println("Failed to update Testrail: " + e.getMessage());
        }

        ExtentManager.getReporter().flush();
        driver.quit();
    }

}
