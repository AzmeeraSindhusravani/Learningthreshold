package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.flipkart.com");
	        driver.manage().window().maximize();
	        String text=driver.findElement(By.xpath("(//span[text()='Login'])[1]")).getText();
	        System.out.println("text present in span: "+text);
	        
	}

}
