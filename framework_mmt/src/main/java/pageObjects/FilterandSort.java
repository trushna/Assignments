package pageObjects;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class FilterandSort {
	 WebDriver driver;
	    WebDriverWait wait;
	    private Actions actions;

	  
	        // Use specific container IDs to avoid "element not found" errors
	        private By typeFilter = By.xpath("//span[contains(text(),'Winter T-Shirt')]");
	        private By sleeveFilter = By.xpath("//span[contains(text(),'Half Sleeves')]");
	        private By productCount = By.xpath("//span[@class='topr lft R12_75']");
	        private By sortDropdown = By.xpath("//div[contains(@class,'sort-select')]");
	        private By priceOption = By.xpath("//a[contains(text(),'Price')]");

	        public FilterandSort(WebDriver driver) {
	            this.driver = driver;
	            this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            this.actions = new Actions(driver);
	        }

	        public void selectTypeFilter() {
	            // Actions.moveToElement is the best non-JS way to scroll
	            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(typeFilter));
	            actions.moveToElement(element).click().perform();
	        }

	        public void selectSleeveFilter() {
	        	wait.until(ExpectedConditions.presenceOfElementLocated(sleeveFilter));
	            
	            // Use JavascriptExecutor to click if the element is overlapped by a loader
	            try {
	                wait.until(ExpectedConditions.elementToBeClickable(sleeveFilter)).click();
	            } catch (Exception e) {
	                // Fallback: Force click if standard click is intercepted during page update
	                org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
	                js.executeScript("arguments[0].click();", driver.findElement(sleeveFilter));
	            }
	        }
	        

	        public String getItemCount() {
	        	String text=
	             wait.until(ExpectedConditions.visibilityOfElementLocated(productCount)).getText();
	            	     text=text.replaceAll("[^0-9]","");
	            	     System.out.println(text);
	            	     return text;
	        }

	        public void sortByPriceLowToHigh() {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            
	            // 1. Click the Sort By dropdown to reveal options
	            wait.until(ExpectedConditions.elementToBeClickable(sortDropdown)).click();
	            
	         //   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

	            // 2. Wait for the 'Price' option to be visible and click it
	            WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(priceOption));
	            price.click();
	        }

		}
