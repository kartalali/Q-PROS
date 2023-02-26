package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id = "loginusername")
    public WebElement userName;

    @FindBy(id = "loginpassword")
    public WebElement passWord;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    public WebElement loginButton;

    @FindBy(xpath = "(//button[@class='btn btn-secondary'])[3]")
    public WebElement closeLoginModal;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}

