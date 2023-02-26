package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LaptopPage extends CommonMethods {

    @FindBy(css= "h4.card-title")
    public List<WebElement> laptopItems;

    @FindBy(xpath = "//a[contains(@onclick, 'addToCart')]")
    public WebElement addToCart;

    public LaptopPage(){
        PageFactory.initElements(driver, this);
    }
}

