package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titlejs {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://qlana.dev.zeroco.de");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        //js.executeScript("return document.title");
	        js.executeScript("window.scrollByPages(3)");
	        
	}

}
