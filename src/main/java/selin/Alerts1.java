package selin;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {
	WebDriver odriver;
	@BeforeMethod     //Annonation
		
		
		void open() {
			WebDriverManager.chromedriver().setup();
			odriver=new ChromeDriver();
			odriver.manage().window().maximize();
			odriver.manage().deleteAllCookies();
			 odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			 
			
		}
		@Test
		void reg() throws InterruptedException {
			 WebElement jsAlert=odriver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		        
		        jsAlert.click();
		        Thread.sleep(300);
		        
		        Alert jsalert=odriver.switchTo().alert();
		        String textInJsAlert=jsalert.getText();
		        System.out.println(textInJsAlert);
		        Thread.sleep(300);
		        jsalert.accept();
		        
		        WebElement jsConfirm=odriver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		        
		        jsConfirm.click();
		        Thread.sleep(300);
		        
		        
		        Alert jsconfirm=odriver.switchTo().alert();
		        String textInJsConfirm=jsconfirm.getText();
		        System.out.println(textInJsConfirm);
		        Thread.sleep(300);
		        jsalert.dismiss();
		        
		        WebElement jsPrompt=odriver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		        
		        jsPrompt.click();
		        
		        
		        Alert jsprompt=odriver.switchTo().alert();
		        String textInJsPrompt=jsprompt.getText();
		        System.out.println(textInJsPrompt);
		        jsprompt.sendKeys("Bangalore");
		        
		        jsalert.accept();
		        
		        
		        
		    
		        
		        //odriver.close();
		}
		
		
			@AfterMethod
			void qu() {
				odriver.quit();
			}

}
