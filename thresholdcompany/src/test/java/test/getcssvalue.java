package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       String bgcolor= driver.findElement(By.xpath("//button[@type='button']")).getCssValue("background-color");
      String color=  driver.findElement(By.xpath("//span[text()='Log In']")).getCssValue("border-bottom-color");
       String width= driver.findElement(By.xpath("//span[text()='Log In']")).getCssValue("border-left-width");
        System.out.println("css value for background is: "+bgcolor);
        

	}

}
