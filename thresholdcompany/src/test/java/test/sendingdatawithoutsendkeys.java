package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendingdatawithoutsendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS. executeScript("document.getElementById('email').value='SoftwareTestingMaterial.com'");
		JS. executeScript("document.getElementById('pass').value='tester'");

	}

}
