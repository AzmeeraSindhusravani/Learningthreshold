package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uniquevaluesindropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMBA SHIV\\Desktop\\threshold\\Systemtest\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("http://total-qa.com/interview-question-identify-the-duplicate-items-in-the-listboxhashmapselenium-webdriver/");
        WebElement dropdown=driver.findElement(By.id("automationtools"));
        Select s=new Select(dropdown);
        List<WebElement> list = s.getOptions();

      Iterator<WebElement> iter = list.iterator();
      while(iter.hasNext()){
          if(iter.next().getText().equals("SELENIUM")){
              iter.remove();
              break;
          }
      }

      System.out.println("after removing duplicates ");
      for(WebElement ele: list) {
          System.out.println(ele.getText());
          }
      }
}
	
		/*
		  Select s=new Select(dropdown);
		  List<WebElement> list=s.getOptions(); 
		  for(int i=0;i<list.size();i++) { if(list.equals("SELENIUM")) { 
			  break; 
			  }else {
		  }
		  System.out.println(list.get(i).getText()); } }*/
		 
       /* List<WebElement> options = driver.findElements(By.id("automationtools"));
        HashSet<String> optionNames = new HashSet<String>();
        for (WebElement option : options) {
            if (optionNames.equals(option.getText())) {
                System.out.println("Duplicate found");
                
            } else {
            	System.out.println("else conditon");
              System.out.println(optionNames.add(option.getText()));
        }
            System.out.println("for loop outside");
          }
        System.out.println(optionNames);
	}*/
       