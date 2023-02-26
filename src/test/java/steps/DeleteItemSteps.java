package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import utils.CommonMethods;

public class DeleteItemSteps extends CommonMethods {

    @Given("click on cart from header")
    public void click_on_cart_from_header() throws InterruptedException {
        Thread.sleep(5000);
        click(dashboardPage.cart);
    }

    @Given("click on delete")
    public void click_on_delete() throws InterruptedException {
        Thread.sleep(5000);
        click(cartPage.delete);
    }
}
