package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
	WebDriver odriver;
	
	@BeforeSuite
	void test() {
		WebDriverManager.chromedriver().setup();
		odriver= new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		 odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
		
	}
	 @Test
	    void getTitleOfThePage()
	    {
		 odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	        
	        String title=odriver.getTitle();
	        System.out.println("title"+title);
	        
	        
	    }
	 @Test
	    void registrationForm() 
	    {
		 odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       odriver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mohan vamsi");
	       
	       odriver.findElement(By.name("RESULT_TextField-2")).sendKeys("krishna");
	       
	       odriver.findElement(By.xpath("(//input[@class=\"text_field\"])[3]")).sendKeys("8106846189");
	       
	       odriver.findElement(By.xpath("//input[@name=\"RESULT_TextField-4\"]")).sendKeys("INDIA");
	       
	       odriver.findElement(By.xpath("//input[@name=\"RESULT_TextField-5\"]")).sendKeys("Madanapalli");
	       
	       
	       
	       odriver.findElement(By.id("RESULT_TextField-6")).sendKeys("vamsikrishna81068@gmail.com");
	       
	       
	       
	    }
	    
	 @AfterSuite
	 void close() {
		 odriver.close();
	 }

}
