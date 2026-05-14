package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.*;
import pageObjects.AddToCart;
import pageObjects.FilterandSort;

public class C_AddToCart extends Base {

    AddToCart addToCart;
    AddToCart detailsPage;

    String listingName;
    String listingPrice;

    private static final Logger logger =
            LogManager.getLogger(C_AddToCart.class);

    @When("user captures first product details")
    public void user_captures_first_product_details() {

        addToCart = new AddToCart(getDriver());

      //  listingName = addToCart.getFirstProductName();
        //listingPrice = addToCart.getFirstProductPrice();

        //System.out.println("Listing Name: " + listingName);
        //System.out.println("Listing Price: " + listingPrice);
    }

    @When("user clicks on first product")
    public void user_clicks_on_first_product() {

        addToCart = new AddToCart(getDriver());

        String parent = getDriver().getWindowHandle();

        addToCart.clickFirstProduct();

        // Switch to new tab
        for (String window : getDriver().getWindowHandles()) {
            if (!window.equals(parent)) {
                getDriver().switchTo().window(window);
                break;
            }
        }

        detailsPage = new AddToCart(getDriver());
    }

    @Then("product details should match with listing page")
    public void product_details_should_match() {

        String detailsName = detailsPage.getProductTitle();
        String detailsPrice = detailsPage.getProductPrice();

        System.out.println("Details Name: " + detailsName);
        System.out.println("Details Price: " + detailsPrice);

       /* Assert.assertTrue(
                detailsName.toLowerCase()
                        .contains(listingName.toLowerCase().split("-")[0].trim()),
                "Product name mismatch!"
        );

        Assert.assertEquals(
                normalizePrice(detailsPrice),
                normalizePrice(listingPrice),
                "Product price mismatch!"
        );*/
    }

    private String normalizePrice(String price) {
        return price.replaceAll("[^0-9]", "");
    }
    @Then("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
    	addToCart.clickAddToCart();

    }
    @Then("the product should be successfully added to the cart")
    public void the_product_should_be_successfully_added_to_the_cart() {
        String currentCount = addToCart.getCartItemCount();
        String cleanCount = currentCount.replaceAll("[^0-9]", ""); 
        
        Assert.assertEquals(cleanCount, "1", "The item was added to the cart correctly!");

        }
}