package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.navigate().to("https://www.facebook.com");
	        driver.navigate().to("https://www.google.com");
	        driver.navigate().back();
	        driver.navigate().forward();
	        driver.navigate().refresh();
	        driver.get("https://google.com");
	        driver.get(driver.getCurrentUrl());
	}

}
