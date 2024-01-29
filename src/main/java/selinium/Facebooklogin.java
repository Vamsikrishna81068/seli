package selinium;

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
		odriver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		
	}
	 @Test
	    void getTitleOfThePage()
	    {
	        
	        String title=odriver.getTitle();
	        System.out.println(title);
	        
	        
	    }
	 @Test
	    void registrationForm() throws InterruptedException
	    {
		 Thread.sleep(3000);
	       odriver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mohan vamsi");
	       Thread.sleep(3000);
	       odriver.findElement(By.id("RESULT_TextField-2")).sendKeys("krishna");
	       Thread.sleep(3000);
	       odriver.findElement(By.id("RESULT_TextField-3")).sendKeys("8106846189");
	       Thread.sleep(3000);
	       odriver.findElement(By.id("RESULT_TextField-4")).sendKeys("INDIA");
	       
	       odriver.findElement(By.id("RESULT_TextField-5")).sendKeys("Madanapalli");
	       Thread.sleep(2000);
	       
	       odriver.findElement(By.id("RESULT_TextField-6")).sendKeys("vamsikrishna81068@gmail.com");
	       
	       Thread.sleep(2000);
	       
	    }
	    
	 @AfterSuite
	 void close() {
		 odriver.close();
	 }

}
