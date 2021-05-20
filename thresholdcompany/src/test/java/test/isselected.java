package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcreate%2F%3Fref_type%3Dregistration_form&locale=en_GB&display=page");
        driver.manage().window().maximize();
        //boolean selected=driver.findElement(By.id("year")).isSelected();
        //System.out.println("element is: "+selected);
		
		WebElement gender=  driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		boolean g=gender.isSelected();
		  Thread.sleep(2000);
		  
		  System.out.println(g);
		  
		 // boolean isselect=driver.findElement(By.xpath("//label[text()='Female']")).
		 Thread.sleep(2000);
		  //System.out.println("element is: "+isselect);
		 
	}



	}

	


