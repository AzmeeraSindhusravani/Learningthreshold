package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setbrowsersize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().setSize(new Dimension(200, 200));

	}

}
