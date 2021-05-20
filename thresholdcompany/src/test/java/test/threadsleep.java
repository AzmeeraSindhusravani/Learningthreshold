package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class threadsleep {

	public static void main(String[] args) throws Throwable {
		 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        
		        driver.get("https://brd.dev.zeroco.de");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@placeholder='Enter Email ID or Contact No.']")).sendKeys("praveen.m@thresholdsoft.com");
		        Thread.sleep(2000);
		       driver.findElement(By.xpath("//*[@placeholder='Enter Password']")).sendKeys("The@123456");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	           
	}

}
