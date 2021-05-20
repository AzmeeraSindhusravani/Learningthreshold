package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printduplicate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("http://total-qa.com/interview-question-identify-the-duplicate-items-in-the-listboxhashmapselenium-webdriver/");
         Select s=new Select(driver.findElement(By.id("automationtools")));
		
		List<WebElement> list=s.getOptions();
		Set<String>listnames=new HashSet<String>(list.size());
		for(WebElement element: list) {
			if(listnames.add(element.getText())==false) {
		System.out.println("list of duplicate in dropdown is "+element.getText());
		
	} else {
		System.out.println(element.getText());
	}
		}
	}
	}
			
	 /* List<WebElement> elements=s.getOptions(); 
	  for(int i=0;i<list.size();i++) { if(list.equals(element)) { 
		  break; 
		  }else {
	  }
	  System.out.println(list.get(i).getText()); } }
	 
			}
		}
	*/
			
		