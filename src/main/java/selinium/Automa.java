package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automa {
	WebDriver odriver;
	@BeforeMethod
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
		System.out.println(Actualtitle);
		 String expectedTitle="Sign up for Square";
	        
	        Assert.assertEquals(Actualtitle, expectedTitle);
		
	}
	@Test
	void Url() {
		String Actualurl=odriver.getCurrentUrl();
		System.out.println(Actualurl);
	}
	@Test
	void reg() throws InterruptedException {
		Thread.sleep(4000);
		

		String Firstname=odriver.findElement(By.xpath("//label[@for='first-name']")).getText();
		System.out.println(Firstname);
		
		odriver.findElement(By.id("first-name")).sendKeys("MohanVamsi");
		Thread.sleep(4000);
		String Lastname=odriver.findElement(By.xpath("//label[@for='last-name']")).getText();
		System.out.println(Lastname);
		odriver.findElement(By.id("last-name")).sendKeys("Krishna");
		Thread.sleep(4000);
		odriver.findElement(By.id("email")).sendKeys("vamsikrishna81068@gmail.com");
		Thread.sleep(4000);
		odriver.findElement(By.id("email-confirmation")).sendKeys("vamsikrishna81068@gmail.com");
		Thread.sleep(4000);
		odriver.findElement(By.name("password")).sendKeys("Vamsi@940");
		Thread.sleep(4000);
		odriver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(4000);
		
		

	}
	@AfterMethod
	void close() {
		odriver.close();
	}

}
