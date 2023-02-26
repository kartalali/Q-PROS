package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import utils.CommonMethods;
import utils.ConfigReader;

public class SignupSteps extends CommonMethods {

    @Given("user clicks signup from header")
    public void user_clicks_signup_from_header() {
        click(mainPage.signUp);
    }

    @Given("user enters username")
    public void user_enters_username() {
        sendText(signupPage.username, ConfigReader.getPropertyValue("username"));
    }
    @Given("user enters password")
    public void user_enters_password() {
        sendText(signupPage.password, ConfigReader.getPropertyValue("password"));
    }
    @Given("user clicks signup button")
    public void user_clicks_signup_button() {
    click(signupPage.signUpButton);
    }
    @Given("verify account creation")
    public void verify_account_creation() throws InterruptedException {
        Thread.sleep(5000);
        Alert al = driver.switchTo().alert();
        String expectedText = al.getText();
        System.out.println(expectedText);
        al.accept();
        String actualText = "Sign up successful.";
        Assert.assertEquals(actualText,expectedText);
    }



}
