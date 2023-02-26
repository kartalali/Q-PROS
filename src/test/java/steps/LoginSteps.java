package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user clicks login from header")
    public void user_clicks_login_from_header() {
        click(mainPage.login);
    }

    @Given("user fills username")
    public void user_fills_username() {
        sendText(loginPage.userName, ConfigReader.getPropertyValue("username"));
    }
    @Given("user fills password")
    public void user_fills_password() {
        sendText(loginPage.passWord, ConfigReader.getPropertyValue("password"));
    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
    click(loginPage.loginButton);
    }

}
