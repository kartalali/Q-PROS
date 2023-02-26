package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SignupPage extends CommonMethods {

    @FindBy(id = "sign-username")
    public WebElement username;

    @FindBy(id = "sign-password")
    public WebElement password;

    @FindBy(xpath = "//button[@onclick='register()']")
    public WebElement signUpButton;

    @FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
    public WebElement closeSignUpModal;

    public SignupPage(){
        PageFactory.initElements(driver, this);
    }
}

