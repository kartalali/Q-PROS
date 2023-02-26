package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;

public class AddItemSteps extends CommonMethods {

    @Given("pick from item on page and click")
    public void pickFromItemOnPageAndClick() throws InterruptedException {
        Thread.sleep(5000);
        pickfromItemOnPage(laptopPage.laptopItems,"MacBook air");
    }
    @Given("click add to cart button")
    public void clickAddToCartButton() throws InterruptedException {
        Thread.sleep(5000);
        click(laptopPage.addToCart);
    }
    @Given("verify item added")
    public void verifyItemAdded() throws InterruptedException {
        Thread.sleep(5000);
        Alert ale = driver.switchTo().alert();
        String expectedText = ale.getText();
        System.out.println(expectedText);
        ale.accept();
        String actualText = "Product added.";
        Assert.assertEquals(actualText,expectedText);
    }
}
