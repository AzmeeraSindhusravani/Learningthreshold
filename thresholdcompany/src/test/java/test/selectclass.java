package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {

	public static void main(String[] args) throws Throwable  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			
			 Select s=new Select(driver.findElement(By.id("day"))); s.selectByIndex(4);
			 Select s1=new Select(driver.findElement(By.id("month")));
			 s1.selectByVisibleText("Jun");
			 Thread.sleep(3000);
			// WebElement yeardropdown=driver.findElement(By.id("year"));
			//  yeardropdown.selectByValue("1994");
			//  Select s2=new Select(yeardropdown);
			// System.out.println(yeardropdown.isDisplayed());
			 Select s2=new Select(driver.findElement(By.id("year")));
			s2.selectByValue("1994");
			boolean searchyear= driver.findElement(By.id("year")).isSelected();
			System.out.println(searchyear);
			 
			 
		
			 
			 
				/*
				 * WebElement yearselector=driver.findElement(By.name("birthday_year"));
				 * //yearselector.click(); if(yearselector.isSelected()) { Select s2=new
				 * Select(driver.findElement(By.name("birthday_year")));
				 * 
				 * s2.selectByValue("1994"); }else {
				 * System.out.println("dropdown not selected yet"); }
				 */
	        
	       
	}

}
