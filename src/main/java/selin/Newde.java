package selin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newde {
	WebDriver odriver;
	@BeforeMethod     //Annonation
	
	
	void open() {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		 odriver.get(" https://squareup.com/signup/us?lang_code=en-us&v=online-store");
		 
		 
		
	}
	@Test
	void Title() {
		String Actualtitle=odriver.getTitle();
		//printing title of the page
		System.out.println(Actualtitle);
		 String expectedTitle="Sign up for Square";
		 //checking the title whether actual and expected tile or same or not
	        
	        Assert.assertEquals(Actualtitle, expectedTitle);
	}
	@Test
	void Url() {
		String Actualurl=odriver.getCurrentUrl();
		//printing url of the page
		System.out.println(Actualurl);
	}
	@Test
	void reg() throws InterruptedException {//LOCATORS: ID,CLASS,LINKTEXT,PARTIALLINKTEXT
		//TAGNAME,XPATH,CSS,CLASS NAME
		Thread.sleep(2000);
		odriver.findElement(By.id("first-name")).sendKeys("MohanVamsi");//print the mohan vamsi in firstname of empty box
		Thread.sleep(2000);
		odriver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("krishna");
		
		odriver.findElement(By.xpath("(//input[contains(@name,'email')])[1]")).sendKeys("vamsikrishna81068@gmail.com");
		Thread.sleep(2000);

		odriver.findElement(By.name("password")).sendKeys("Vamsi@940");
		
		}
	@AfterMethod
	void close() {
		//closing the tab
		odriver.close();
	}

}
