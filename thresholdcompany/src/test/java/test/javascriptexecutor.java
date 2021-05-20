package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws Throwable {
		 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("https://www.facebook.com");
		        driver.manage().window().maximize();
		        Thread.sleep(3000);
		        JavascriptExecutor js=(JavascriptExecutor)driver;
		        js.executeScript("window.scrollBy(0,1000)", "");
		        WebElement element=driver.findElement(By.xpath("//a[text()='Games']"));
		        //js.executeScript("arguments[0].scrollIntoView();", element);
		       // System.out.println(element.getText());
		       // System.out.println(element.getTagName());

	}

}
