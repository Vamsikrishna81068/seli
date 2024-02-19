package selin;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {
	WebDriver odriver;
	@BeforeMethod     //Annonation
		
		
		void open() {
			WebDriverManager.chromedriver().setup();
			odriver=new ChromeDriver();
			odriver.manage().window().maximize();
			odriver.manage().deleteAllCookies();
			 //odriver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			odriver.get("https://www.naukri.com/");
			 
			
		}
		@Test
		void reg() throws InterruptedException {
			 WebElement services=odriver.findElement(By.xpath("//div[text()='Services']"));
		        
		        services.click();
		        
		        //get the window ids
		        
		        Set<String> ohandle=odriver.getWindowHandles();
		        
		        
		        Iterator<String> it=ohandle.iterator();
		        
		        String parentWindowId=it.next();
		        System.out.println("Parent window id is ---->"+parentWindowId);
		        
		        
		        String childWindowId=it.next();
		        System.out.println("child window id is ---->"+childWindowId);
		        
		        
		        //switching to window
		        
		        odriver.switchTo().window(childWindowId);
		        
		        String title=odriver.getTitle();
		        System.out.println(title);
		        
		        String url=odriver.getCurrentUrl();
		        System.out.println(url);
		        
		        odriver.close();
		        
		        
		        odriver.switchTo().window(parentWindowId);
		        
		        String parenttitle=odriver.getTitle();
		        System.out.println(parenttitle);
		        
		        String parenturl=odriver.getCurrentUrl();
		        System.out.println(parenturl);
			
		
		}
			@AfterMethod
			void qu() {
				odriver.close();
			}
}
