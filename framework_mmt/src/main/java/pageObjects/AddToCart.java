package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class AddToCart  {
	WebDriver driver;
    WebDriverWait wait;

    // Locators
    By firstProductLink =  By.xpath("(//a[contains(@href,'product-detail')])[1]");
    By firstProductName = By.xpath("(//*[@id=\"prodImgInfo\"]/section[2]/section[1]/h1/span/span/span");
    By firstProductPrice = By.xpath("(//div[contains(@class,'list-ctr')]//span[contains(text(),'₹')])[1]");
    By productTitle = By.xpath("//h1");
    By brandName = By.xpath("//a[contains(@href,'brand')]");
    By productPrice = By.xpath("//*[@id=\"prodImgInfo\"]/section[2]/section[1]/p/span/span[1]");
    By addtocart= By.xpath("//*[text()='ADD TO CART']");
    By cartBadgeCount = By.id("cart_TotalCount");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println(driver);
    }
   /* public String getFirstProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductName)).getText();
    }

    public String getFirstProductPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductPrice)).getText();
    }
*/
    public void clickFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // By firstProduct = By.xpath("(//a[contains(@href,'product-detail')])[1]");

        wait.until(ExpectedConditions.elementToBeClickable(firstProductLink)).click();

    	
    	}
    
    

    public String getProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).getText();
    }

    public String getBrandName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(brandName)).getText();
    }

    public String getProductPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice)).getText();
    }
    public void clickAddToCart() {
        // Wait for element to be present and clickable before interaction
        wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
    }

    public String getCartItemCount() {
        // Wait for the cart quantity to update after the click
        wait.until(ExpectedConditions.textToBePresentInElementLocated(cartBadgeCount, "1"));
        return driver.findElement(cartBadgeCount).getText();
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadgeCount)).getText();
    }
    }
