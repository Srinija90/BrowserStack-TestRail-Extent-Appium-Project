package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class LoginPage extends BasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 5000;




    @AndroidFindBy(xpath = "//*[@content-desc='LoginEmailField']")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='LoginEmailField']")
    private MobileElement usernameField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='LoginPasswordField']")
    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@name='LoginPasswordField']")
    private MobileElement passwordField;






    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean enterUsernameAndPassword(String username, String password) throws InterruptedException {
        boolean usernameStatus = sendKeysToElement(username, usernameField, false);

        passwordField.click();
        Thread.sleep(KEYBOARD_ANIMATION_DELAY);
        passwordField.sendKeys(password);

        return usernameStatus;
    }
}


