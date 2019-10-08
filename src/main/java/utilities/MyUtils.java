package utilities;

import static io.appium.java_client.touch.offset.PointOption.point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.PointOption.point;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.print.PrintException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MyUtils {

    public static void rightLeftSwipe(AppiumDriver driver) {

        // No Unique classnames available in the apk
        Dimension windowSize = driver.manage().window().getSize();

        // Performing gesture tap action
        int startX = windowSize.getWidth() - 200;
        int startY = 500;
        PointOption stratPoint = point(startX, startY);

        int endX = 200;
        int endY = 500;
        PointOption endPoint = point(endX, endY);
        // System.out.println(windowSize);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void rightLeftSwipe_IOS(AppiumDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("duration", 1.0);
        params.put("fromX", 356);
        params.put("fromY", 317);
        params.put("toX", 19);
        params.put("toY", 317);
        js.executeScript("mobile: dragFromToForDuration", params);


    }

    public static void scrollDown(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 1200;
        PointOption stratPoint = point(startX, startY);

        int endX = 200;
        int endY = size.height - 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUpSome(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 1500;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 100;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUpInUploadStylePage(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 1500;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 100;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUp(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 400;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUp_iOS(AppiumDriver driver) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("duration", 1.0);
        params.put("fromX", 185);
        params.put("fromY", 450);
        params.put("toX", 185);
        params.put("toY", 100);
        js.executeScript("mobile: dragFromToForDuration", params);
    }

    public static void scrollUp_NewUserRegistration_iOS(AppiumDriver driver) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("duration", 1.0);
        params.put("fromX", 171);
        params.put("fromY", 488);
        params.put("toX", 171);
        params.put("toY", 100);
        js.executeScript("mobile: dragFromToForDuration", params);
    }

    public static void scrollUp_UploadStyle_iOS(AppiumDriver driver) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("duration", 1.0);
        params.put("fromX", 172);
        params.put("fromY", 474);
        params.put("toX", 172);
        params.put("toY", 125);
        js.executeScript("mobile: dragFromToForDuration", params);
    }

    public static void scrollUp_NewUserRegistration(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 500;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUptoEnterComment(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 600;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUpEditProProfile(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 500;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void scrollUpEditClientProfile(AppiumDriver driver) throws Exception {

        // The viewing size of the device
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = size.height - 500;
        PointOption stratPoint = point(startX, startY);

        int endX = size.width / 2;
        int endY = 200;
        PointOption endPoint = point(endX, endY);

        TouchAction touchaction = new TouchAction(driver);
        touchaction.press(stratPoint);
        touchaction.waitAction();
        touchaction.moveTo(endPoint);
        touchaction.release();
        touchaction.perform();
    }

    public static void clientLogin(AndroidDriver driver) throws Exception {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        MobileElement element = (MobileElement) wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("28@test.com");
        driver.findElementByXPath("//android.widget.EditText[@content-desc='LoginPasswordField']")
                .sendKeys("password1");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Log in']").click();
        MobileElement introscreen1 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen1']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen2 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen2']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen3 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen3']")));

        Thread.sleep(2000);
        driver.findElementByXPath("//android.view.ViewGroup[4]").click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        MobileElement element1 = (MobileElement) wait1.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        Thread.sleep(2000);
    }

    public static void clientWithAddedCardDetailsLogin(AndroidDriver driver) throws Exception {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        MobileElement element = (MobileElement) wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("30@test.com");
        driver.findElementByXPath("//android.widget.EditText[@content-desc='LoginPasswordField']")
                .sendKeys("password1");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Log in']").click();
        MobileElement introscreen1 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen1']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen2 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen2']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen3 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen3']")));

        Thread.sleep(2000);
        driver.findElementByXPath("//android.view.ViewGroup[4]").click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        MobileElement element1 = (MobileElement) wait1.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        Thread.sleep(2000);
    }

    public static void clientWithNoAddedCardDetailsLogin(AndroidDriver driver) throws Exception {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        MobileElement element = (MobileElement) wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("30@test.com");
        driver.findElementByXPath("//android.widget.EditText[@content-desc='LoginPasswordField']")
                .sendKeys("password1");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Log in']").click();
        MobileElement introscreen1 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen1']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen2 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen2']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen3 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen3']")));

        Thread.sleep(2000);
        driver.findElementByXPath("//android.view.ViewGroup[4]").click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        MobileElement element1 = (MobileElement) wait1.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        Thread.sleep(2000);
    }

    public static void beautyProLogin(AndroidDriver driver) throws Exception {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        MobileElement element = (MobileElement) wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.ImageView")));
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("august@test.com");
        driver.findElementByXPath("//android.widget.EditText[@content-desc='LoginPasswordField']")
                .sendKeys("password1");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Log in']").click();

        MobileElement introscreen1 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen1']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen2 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen2']")));

        Thread.sleep(2000);
        MyUtils.rightLeftSwipe(driver);

        MobileElement introscreen3 = (MobileElement) wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='IntroScreen3']")));

        Thread.sleep(2000);
        driver.findElementByXPath("//android.view.ViewGroup[4]").click();

        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        MobileElement element1 = (MobileElement) wait1.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("com.android.packageinstaller:id/permission_allow_button")));
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        Thread.sleep(2000);
    }

    public static void hideKeyboard(AppiumDriver driver) {

        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            //do nothing
        }
    }

    public static void scrollUpiOSOnHomeScreen(AppiumDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("duration", 1.0);
        params.put("fromX", 172);
        params.put("fromY", 474);
        params.put("toX", 172);
        params.put("toY", 125);
        js.executeScript("mobile: dragFromToForDuration", params);

    }

}
