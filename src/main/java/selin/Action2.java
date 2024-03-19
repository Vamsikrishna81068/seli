package selin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2 {
	WebDriver odriver;

	@BeforeMethod
	void open() {
		WebDriverManager.chromedriver().setup();
		odriver = new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		odriver.get("https://demo.guru99.com/test/drag_drop.html");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));

	}

	@Test
	void reg() {
		WebElement drag = odriver.findElement(
				By.xpath("//a[text()=' BANK ']/..li"));
		WebElement drop=odriver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
						
	      
        //Using Action class for drag and drop.		
        Actions act=new Actions(odriver);	
        act.dragAndDrop(drag, drop);
        act.clickAndHold(drag);
        act.moveToElement(drop);
        act.release(drag);
        act.build().perform()
;        
      
        //Drag and Drop by Offset.		
        	
		
		
		
	}
}
