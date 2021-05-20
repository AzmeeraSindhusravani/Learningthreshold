package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getdropdown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	        Select s=new Select(driver.findElement(By.id("day")));
	        s.selectByIndex(4);
	        Select s1=new Select(driver.findElement(By.id("month")));
	        s1.selectByVisibleText("Jun");
	        List<WebElement> op = s1.getOptions();
		      int size = op.size();
		      for(int i =0; i<size ; i++){
		         String options = op.get(i).getText();
		         System.out.println(options);
		}
	}
		

}
