package selinium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
WebDriver odriver;
	

	
	@BeforeMethod
	void open() {
		
	}
	@Test
	public void setUp()  {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		odriver.navigate().to("https://www.google.com");	
		odriver.navigate().back();
		odriver.navigate().to("https://www.facebook.com");
		odriver.navigate().refresh();
	}
	@AfterMethod
	public void tearDown()  {
		
		odriver.close();
	
	}
}
