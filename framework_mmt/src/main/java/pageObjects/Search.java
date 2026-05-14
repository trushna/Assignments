package pageObjects;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Search extends Base{
	WebDriver driver;
	WebDriverWait wait;

    // Define locators as 'By' objects
    private By searchBar = By.id("search_box");
    private By searchIcon = By.xpath("//span[contains(@class, 'search-button')]");

    public Search(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    // Action: Type into the search box
    public void searchForProduct(String text) {
        // Wait for element and find it directly
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
        element.clear();
        element.sendKeys(text);
        driver.findElement(searchIcon).click();

    }
}
