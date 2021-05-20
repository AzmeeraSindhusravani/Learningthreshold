package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        List<WebElement> links=driver.findElements(By.tagName("a"));
	        System.out.println(links.size());
	       for(int i=0;i<links.size();i++) {
	        	WebElement ele=links.get(i);
	        System.out.println(ele);
	       String urllinks=ele.getAttribute("href");
	       System.out.println(urllinks);
	        	//driver.findElement(By.id("Mobile number or email address")).getAttribute("placeholder");
	        	
	        	
	        }

	}

}
