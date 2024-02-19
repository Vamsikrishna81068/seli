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

public class Handlewindow {
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
			String parent=odriver.getWindowHandle();
			System.out.println(parent);
			Thread.sleep(300);
			WebElement pa=odriver.findElement(By.xpath("//div[text()='Services']"));
			Thread.sleep(300);
			pa.click();
			Set<String>child=odriver.getWindowHandles();
			//for(String child1:child) {
				//System.out.println(child1);
			//}
			Iterator<String>li=child.iterator();
			System.out.println(li.next());
			String chi=li.next();
			Thread.sleep(300);
			System.out.println("child----->"+chi);
				if(child.equals(parent)) {
					odriver.switchTo().window(parent);
					String title1=odriver.getTitle();
					Thread.sleep(300);
					System.out.println("parent title----->"+title1); 
					
					
				}
				else {
					odriver.switchTo().window(chi);
					Thread.sleep(300);
					String title=odriver.getTitle();
					Thread.sleep(300);
					System.out.println("child title----->"+title);
					
				}
				
			
			/*Iterator<String>li=child.iterator();
			System.out.println(li.next());
			String chi=li.next();
			Thread.sleep(300);
			System.out.println("child----->"+chi);
			odriver.switchTo().window(chi);
			Thread.sleep(300);
			String title=odriver.getTitle();
			Thread.sleep(300);
			System.out.println("child title----->"+title);
			odriver.switchTo().window(parent);
			String title1=odriver.getTitle();
			Thread.sleep(300);
			System.out.println("parent title----->"+title1);     */
			
			
			
			
			
		
		}
			@AfterMethod
			void qu() {
				odriver.quit();
			}

}
