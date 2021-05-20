package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {
	       public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://brd.dev.zeroco.de");
	        driver.findElement(By.xpath("//*[@placeholder='Enter Email ID or Contact No.']")).sendKeys("praveen.m@thresholdsoft.com");
	        driver.findElement(By.xpath("//*[@placeholder='Enter Password']")).sendKeys("The@123456");
	        driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	   

	}

}
