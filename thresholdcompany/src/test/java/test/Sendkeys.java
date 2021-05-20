package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("xyz123");
        driver.findElement(By.id("pass")).sendKeys("xyz143");
        driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
