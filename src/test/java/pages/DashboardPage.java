package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cart;
    @FindBy(xpath = "//div[@class='list-group']/a")
    public List<WebElement> categories;

    @FindBy(xpath = "//a[contains(@onclick, 'phone')]")
    public WebElement phoneTab;

    @FindBy(xpath = "//a[contains(@onclick, 'notebook')]")
    public WebElement laptopTab;

    @FindBy(xpath = "//a[contains(@onclick, 'monitor')]")
    public WebElement monitorTab;

    @FindBy(css= "h4.card-title")
    public List<WebElement> phoneItems;

    @FindBy(css= "h4.card-title")
    public List<WebElement> laptopItems;

    @FindBy(css= "h4.card-title")
    public List<WebElement> monitorItems;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}

