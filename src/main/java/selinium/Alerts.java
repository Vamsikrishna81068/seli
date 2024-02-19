package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
WebDriver odriver;
    
    @BeforeMethod
    void launchBrowser()
    {
        
        WebDriverManager.chromedriver().setup();
        
        odriver=new ChromeDriver();
    
        odriver.manage().window().maximize();
        
        odriver.manage().deleteAllCookies();
      
        
        odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
    
        
        
    }
    @Test
    void registrationForm() 
    {
    	String js=odriver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    	js.click();
    }
    

}
