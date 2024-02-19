package selinium;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Waits {
	WebDriver odriver;
	
@Test
void open() {
	WebDriverManager.chromedriver().setup();
	odriver=new ChromeDriver();
	odriver.manage().window().minimize();
	odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	odriver.get("https://www.google.com");
	
	
}

}
