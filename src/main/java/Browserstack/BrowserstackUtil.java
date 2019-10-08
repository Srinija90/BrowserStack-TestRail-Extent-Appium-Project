package Browserstack;

import io.appium.java_client.AppiumDriver;

public class BrowserstackUtil {
    public static String getSessionURL(AppiumDriver driver) {
        String baseURL = "https://app-automate.browserstack.com/builds/bb/sessions/";

        return baseURL + driver.getSessionId();
    }
}
