package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("txtuId")).sendKeys("admin");
		driver.findElement(By.id("txtPword")).sendKeys("admin");
		driver.findElement(By.id("login")).click();
	    String alertmessage=driver.switchTo().alert().getText();
	    System.out.println(alertmessage);
	    driver.switchTo().alert().accept();


	}

}
