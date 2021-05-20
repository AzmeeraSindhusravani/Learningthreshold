package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectindexvalue {

	public static void main(String[] args) throws Throwable {
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				driver.get("https://www.facebook.com");
				driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
				WebElement dropdownElement = driver.findElement(By.xpath("//select[@aria-label='Month']"));
				Select dropdown = new Select(dropdownElement);
				// select 1st option from the dropdown options
				//dropdown.selectByIndex(4);
				dropdown.selectByVisibleText("Jun");
				String s=dropdown.getFirstSelectedOption().getText();
				System.out.println(s);
				Thread.sleep(10000);
				
			}
		

	}


