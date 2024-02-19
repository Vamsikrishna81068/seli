package selin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	WebDriver odriver;
	@BeforeMethod     //Annonation
		
		
		void open() {
			WebDriverManager.chromedriver().setup();
			odriver=new ChromeDriver();
			odriver.manage().window().maximize();
			odriver.manage().deleteAllCookies();
			 odriver.get("https://www.google.com/");
			 
			 
			
		}
		@Test
		void reg() throws InterruptedException {
			WebElement sea= odriver.findElement(By.id("APjFqb"));
			Thread.sleep(3000);
			sea.sendKeys("HI VAMSI");
			Thread.sleep(3000);
			sea.submit();
			Thread.sleep(3000);
			odriver.navigate().back();
			Thread.sleep(3000);
			odriver.navigate().to("https://www.facebook.com/");
			Thread.sleep(3000);
			odriver.navigate().back();
			Thread.sleep(3000);
			odriver.navigate().forward();
			Thread.sleep(3000);
			
			}
		@AfterMethod
		void qu() {
			odriver.close();
		}
}
