package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingxpath {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sindhusravani123");
	        

	}

}
