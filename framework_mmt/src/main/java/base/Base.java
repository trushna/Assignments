package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	 public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void setDriver(WebDriver driver1) {
	        driver.set(driver1);
	    }
public String getUrl() throws Exception
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream
		("C:\\Users\\amitp\\eclipse-workspace\\framework_mmt\\src\\main\\java\\data.properties"));
		return prop.getProperty("url");
	}
	
public String getFrameworkUrl() throws Exception
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream
		("C:\\Users\\amitp\\eclipse-workspace\\framework_mmt\\src\\main\\java\\data.properties"));
		return prop.getProperty("frameworkUrl");
	}
public String getBrowser() throws Exception
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream
		("C:\\Users\\amitp\\eclipse-workspace\\framework_mmt\\src\\main\\java\\data.properties"));
		return prop.getProperty("browser");
	}



}
