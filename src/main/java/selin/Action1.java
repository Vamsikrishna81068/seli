package selin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {
	WebDriver odriver;

	@BeforeMethod
	void open() {
		WebDriverManager.chromedriver().setup();
		odriver = new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		odriver.get("https://the-internet.herokuapp.com/hovers");
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));

	}

	@Test
	void reg() {
		WebElement hov = odriver.findElement(
				By.xpath("//p[contains(text(),'Hover over the image for additional information')]/../div[1]"));
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		//Action class
		Actions act = new Actions(odriver);
		
		act.moveToElement(hov);
		act.build().perform(); 
		WebElement profile = odriver.findElement(By.xpath("//h5[text()='name: user1']"));
		if (profile.isDisplayed()) {
			System.out.println(profile.getText());
		}
	}

	@AfterMethod
	void close() {
		odriver.close();

	}

}
