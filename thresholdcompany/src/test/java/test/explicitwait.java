package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://brd.dev.zeroco.de");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("appUserName"))).sendKeys("praveen.m@thresholdsoft.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Enter Password']"))).sendKeys("The@123456");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary ng-star-inserted']"))).click();

	}

}
