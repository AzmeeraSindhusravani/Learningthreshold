package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class presenceofscrollbar {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
			// open chrome
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// open webpage
			driver.get("https://chercher.tech/java/javascript-executor-selenium-webdriver");

			JavascriptExecutor js = (JavascriptExecutor) driver;

			// get the maximum scroll distance Horizontally
			Object horizontalScrollBar = js.executeScript("return window.scrollMaxX");

			// get the maximum scroll distance Vertically
			Object verticalScrollBar = js.executeScript("return window.scrollMaxY");

			if(! horizontalScrollBar.equals("0")){
				System.out.println("Horizontal Scroll bar is Present");
			}else{
				System.out.println("Horizontal Scroll bar is Not Present");
			}

			if(! verticalScrollBar.equals("0")){
				System.out.println("Vertical Scroll bar is Present");
			}else{
				System.out.println("Vertical Scroll bar is Not Present");
			}
		}
	}



