package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class ListedItemsSteps extends CommonMethods {

    @Then("verify all the tabs")
    public void verify_all_the_tabs(DataTable dataTable) {

        List<String> expectedTabs = dataTable.asList();

        List<String> actualTabs = new ArrayList<>();

        for(WebElement ele: dashboardPage.categories){
            actualTabs.add(ele.getText());
        }
        System.out.println(expectedTabs);

        Assert.assertTrue(expectedTabs.equals(actualTabs));

    }

    @Given("click on phone tab")
    public void click_on_phone_tab() throws InterruptedException {
        Thread.sleep(5000);
       click(dashboardPage.phoneTab);
    }

    @Given("verify any item exist on phone page")
    public void verify_any_item_exist_on_phone_page() throws InterruptedException {
        Thread.sleep(5000);
        checkListedElements(dashboardPage.phoneItems);
    }

    @Given("click on laptop tab")
    public void click_on_laptop_tab() throws InterruptedException {
        Thread.sleep(5000);
       click(dashboardPage.laptopTab);
    }

    @Given("verify any item exist on laptop page")
    public void verify_any_item_exist_on_laptop_page() throws InterruptedException {
        Thread.sleep(5000);
        checkListedElements(dashboardPage.laptopItems);
    }

    @Given("click on monitor tab")
    public void click_on_monitor_tab() throws InterruptedException {
        Thread.sleep(5000);
       click(dashboardPage.monitorTab);
    }

    @Given("verify any item exist on monitor page")
    public void verify_any_item_exist_on_monitor_page() throws InterruptedException {
        Thread.sleep(5000);
        checkListedElements(dashboardPage.monitorItems);
    }
}
