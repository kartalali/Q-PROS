package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class MainPage extends CommonMethods {

    @FindBy(id= "signin2")
    public WebElement signUp;

    @FindBy(id = "login2")
    public WebElement login;

    public MainPage(){
        PageFactory.initElements(driver, this);
    }
}
