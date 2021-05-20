package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class paralleltestingusingonemethod {

	 private WebDriver driver;

		       String url = "http://sites.ecanarys.com/Nopcommercesite";

		       @Parameters ({"browser"})

		       @BeforeTest

		       public void preCondition(String browser)

		       {

		              try

		              {

		                     if(browser.equalsIgnoreCase("Firefox"))

		                     {

		                           driver = new FirefoxDriver();

		                     }

		                     if(browser.equalsIgnoreCase("Chrome"))

		                     {

		                           //Location of the chromedriver.exe file stored in your machine

		                            System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");

		                           driver = new ChromeDriver();

		                     }

		                               

		              }

		              catch (WebDriverException e)

		              {

		                     System.out.println("Browser not found" +e.getMessage());

		              }

		              driver.get(url);

		              driver.manage().window().maximize();

		              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		       }

	}


