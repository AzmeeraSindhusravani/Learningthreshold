package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://qlana.dev.zeroco.de");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@placeholder='Enter Email ID or Contact No.']")).sendKeys("maria.a@bamboocp.com");
        driver.findElement(By.xpath("//*[@placeholder='Enter Password']")).sendKeys("The@1234");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        driver.findElement(By.xpath("(//a[@class='nav-link ng-star-inserted'])[1]")).click();
       // driver.get("https://qlana.dev.zeroco.de/qlana/contact/view/5672F08C2F803156E2029E6C27749F01");
        driver.get("https://qlana.dev.zeroco.de/qlana/contact/contact-stage-view/5672F08C2F803156E2029E6C27749F01?page=qlana%2Fcontact%2Fcontact-basic-information&stage=default");
       driver.findElement(By.xpath("//*[@class='icon-calendar ui-state-default ng-star-inserted']")).click();
      WebDriverWait wait=new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
    	   
       }
	

}
