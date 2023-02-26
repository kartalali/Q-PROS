package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CartPage extends CommonMethods {

    @FindBy(xpath = "//a[contains(@onclick, 'deleteItem')]")
    public WebElement delete;

    public CartPage(){
        PageFactory.initElements(driver, this);
    }
}

