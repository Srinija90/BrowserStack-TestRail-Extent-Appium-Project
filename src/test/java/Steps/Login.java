package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import Pages.*;
import Base.BaseTest;
import org.testng.Assert;

public class Login extends BaseTest {
    private static final String CLIENT_VALID_EMAIL = "aretha.franklin.client@example.com";
    private static final String CLIENT_VALID_PASSWORD = "password1";
    private static final String CLIENT_INVALID_EMAIL = "Invalid Email";
    private static final String CLIENT_INVALID_PASSWORD = "passwor";
    private static final String PRO_VALID_EMAIL = "tina.turner.client@example.com";
    private static final String PRO_VALID_PASSWORD = "password1";


    @Given("^user navigate to the login page$")
    public void setUpPage() throws InterruptedException {


    }

    @Given("^the ([^\"]*) user enters a ([^\"]*) username and password$")
    public void loginAttempt(String usertype, String validity) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        if (usertype.equals("client") && validity.equals("valid")) {
            Assert.assertTrue(loginPage.enterUsernameAndPassword(CLIENT_VALID_EMAIL, CLIENT_VALID_PASSWORD));
        } else if (usertype.equals("pro") && validity.equals("valid")) {
            Assert.assertTrue(loginPage.enterUsernameAndPassword(PRO_VALID_EMAIL, PRO_VALID_PASSWORD));
        } else if (usertype.equals("client") && validity.equals("invalid")) {
            Assert.assertTrue(loginPage.enterUsernameAndPassword(CLIENT_VALID_EMAIL, CLIENT_INVALID_PASSWORD));
        }
    }

}
