package stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import base.Base;
import io.cucumber.java.en.*;
import pageObjects.*;

public class A_Search extends Base{
	Search Search;
private static final Logger logger =
LogManager.getLogger(A_Search.class);
	@Given("user is home page")
	public void user_is_home_page() {
		try {
			logger.debug("Reached Method");
			getDriver().get(this.getUrl());
			//this.get(this.getUrl());
			logger.debug("URL Launched");
			getDriver().manage().window().maximize();
		    logger.debug("Window Maximized");
		   // Thread.sleep(3000);
			
		}
		catch(Exception ex)
		{
			logger.error("Exception occurred:"+ex.getMessage());
		}
			    
	   
	}


@When("enter {string} into the search bar")
public void enter_into_the_search_bar(String string) {
    Search searchPage = new Search(getDriver());

    // Use the methods
    searchPage.searchForProduct("T-shirts for Boys");
    }

@When("click the search icon or press {string}")
public void click_the_search_icon_or_press(String string) {

    System.out.println("Search successful!");

    }
}
