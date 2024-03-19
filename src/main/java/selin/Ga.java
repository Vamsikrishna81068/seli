package selin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ga {
	WebDriver odriver;
	@BeforeMethod
	void open() {
		WebDriverManager.chromedriver().setup();
		 odriver=new ChromeDriver();
		 odriver.manage().window().maximize();
		 odriver.manage().deleteAllCookies();
		 odriver.get("https://99exch.com/login");
		 }
       @Test
       void we() throws Exception  {
    	   
    	   Thread.sleep(3000);
    	   //odriver.findElement(By.id("email")).sendKeys("8106846189");
    	   //odriver.findElement(By.id("pass")).sendKeys("Vamsi940");
    	   odriver.findElement(By.xpath("//*[text()=' Login with Demo ID ']")).click();
    	   Thread.sleep(3000);
    	   odriver.findElement(By.partialLinkText("Int Casino")).click();
    	   Thread.sleep(3000);
    	   odriver.findElement(By.id("childCasino-0-5")).click();
    	   Thread.sleep(3000);
    	   odriver.findElement(By.xpath("//*[text()='Bet On Teen Patti']")).click(); 
    	   Thread.sleep(30000);
    	   odriver.navigate().refresh();
    	   List<WebElement> olist= odriver.findElements(By.tagName(""));
       	
           
           //List<WebElement> olist=odriver.findElements(By.tagName("a"));
           
       
           for(WebElement olist1:olist)
           {
              System.out.println(olist1.getText()+"----->"+ olist1.getAttribute("href"));
               
           }
    	 
    	   
    	   }
      // @AfterMethod
     //  void close() {
    	//   odriver.close();
    	   
     //  }
       
}



