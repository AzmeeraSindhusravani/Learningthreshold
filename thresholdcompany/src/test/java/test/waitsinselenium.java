package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitsinselenium {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("")).sendKeys("xyz890");
        Thread.sleep(2000);
        driver.findElement(By.xpath("")).sendKeys("12345");
        

	}

}
