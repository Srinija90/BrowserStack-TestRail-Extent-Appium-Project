package Base;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends AbstractTestNGCucumberTests {

    public static AppiumDriver driver = null;
    // Browserstack username and accesskey
    public static String userName = "";
    public static String accessKey = "";

    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {
        this.setUpAppium();
    }

    public void setUpAppium() throws MalformedURLException {
        final String env = System.getProperty("env", "");
        final String platform = System.getProperty("platform", "");
        //apk and ipa names
        final String androidAppName = "QA_Latest.apk";
        final String iphoneAppName = "QA.ipa";

        String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        if (env.equals("ci")) {
            URL_STRING = "https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
        }

        URL url = new URL(URL_STRING);
        File f = new File("src");
        DesiredCapabilities capabilities = new DesiredCapabilities();


        if (platform.toLowerCase().equals("android")) {

            if (env.equals("ci")) {
                capabilities.setCapability("device", "Samsung Galaxy S8");
                capabilities.setCapability("os_version", "7.0");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability("disableWindowAnimation", "true");
                capabilities.setCapability("name", "TestExecution");
                capabilities.setCapability("browserstack.timezone", "Europe/London");
                capabilities.setCapability("browserstack.appium_version", "1.13.0");
                capabilities.setCapability("app", "bs://840a3c3aecc0b74eb63e8e92e1a36ff32c69c231");
            } else {
                File fs = new File(f, androidAppName);

                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S8");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
                capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

            }

            capabilities.setCapability("appPackage", "com.browserstack.app");
            capabilities.setCapability("appActivity", "com.browserstack.app.MainActivity");
            capabilities.setCapability("automationName", "UiAutomator2");

            driver = new AndroidDriver<MobileElement>(url, capabilities);

        } else if (platform.toLowerCase().equals("ios")) {

            File fs = new File(f, iphoneAppName);

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.3.1");
            capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            // capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
            capabilities.setCapability("deviceOrientation", "portrait");
            capabilities.setCapability("xcodeOrgId", "");
            capabilities.setCapability("xcodeSigningId", "");
            capabilities.setCapability("udid", "");
            capabilities.setCapability("updateWDABundleId", "");
            capabilities.setCapability("waitForQuiescence", false);
            capabilities.setCapability("wdaEventloopIdleDelay", 5);
            capabilities.setCapability("eventLoopIdleDelaySec", 1);
            capabilities.setCapability("useJSONSource", true);
            capabilities.setCapability("useNewWDA", true);
            capabilities.setCapability("noReset", false);
            capabilities.setCapability("fullReset", true);

            driver = new IOSDriver<MobileElement>(url, capabilities);
        } else {
            throw new Error("No platform env given");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDownAppium() {
        if (driver != null) {
            driver.quit();
        }

    }
}
