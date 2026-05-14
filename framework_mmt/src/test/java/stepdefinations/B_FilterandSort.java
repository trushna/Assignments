package stepdefinations;

import io.cucumber.java.en.*;
import pageObjects.FilterandSort;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;


public class B_FilterandSort extends Base {
    WebDriver driver;

    FilterandSort filterPage;
    private static final Logger logger =
    		LogManager.getLogger(B_FilterandSort.class);
    			public B_FilterandSort(Base context) {
        // Initialize page object with the shared driver from TestContext
        filterPage = new FilterandSort(context.getDriver());
    }

    @When("the user selects the {string} filter under Type")
    public void userSelectsFilterType(String type) {
        filterPage.selectTypeFilter();
    }
    

    @And("the user selects the {string} filter under Sleeve Length")
    public void userSelectsSleeveFilter(String sleeve) {
        filterPage.selectSleeveFilter();
    }

    @Then("the page should display {string} as per the applied filters")
    public void verifyDisplayCount(String expectedCount) {
        String actual = filterPage.getItemCount();
        System.out.println(actual);
    }
    @When("the user sorts products by price low to high")
    public void userSortsByPrice() {
        filterPage.sortByPriceLowToHigh();
    }

}
