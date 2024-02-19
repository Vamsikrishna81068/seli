package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	WebDriver odriver;
	@BeforeMethod
	void add() {
		WebDriverManager.chromedriver().setup()
		;
		 odriver=new ChromeDriver();
		 odriver.manage().window().maximize();
		 odriver.manage().deleteAllCookies();
		 odriver.get("https://www.veltech.edu.in/faculty-login/");
		 }
       @Test
       void open() throws InterruptedException  {
    	   
    	   Thread.sleep(3000);
    	   //odriver.findElement(By.id("email")).sendKeys("8106846189");
    	   //odriver.findElement(By.id("pass")).sendKeys("Vamsi940");
    	   odriver.findElement(By.linkText("Campus to Corporate")).click();
    	   Thread.sleep(3000);
       }
       @AfterMethod
       void close() {
    	   odriver.close();
    	   
       }
       
}
