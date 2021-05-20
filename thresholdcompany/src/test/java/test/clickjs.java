package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickjs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qlana.dev.zeroco.de");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Object searchTextbar=js.executeScript("return document.getElementId('appUserName')");
        ((WebElement) searchTextbar).sendKeys("maria.a@bamboocp.com");
        Object searchTextbar1=js.executeScript("return document.getElementById('appPassword')");
        ((WebElement) searchTextbar1).sendKeys("The@1234");
        js.executeScript("document.getElementsByxpath('//span[text()='Login']'[0].click()");
        
        
        

	}

}
