package selin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {
	WebDriver odriver;
	@BeforeMethod
	void open() {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		odriver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	}
	@Test
	void reg() throws InterruptedException {
		
		WebElement fname=odriver.findElement(By.xpath("//label[text()='First Name ']"));
			String ff	=fname.getText();
			System.out.println("ff--->"+ff);
		
		
		WebElement name=odriver.findElement(By.xpath("(//input[@name='name'])[1]"));
		Thread.sleep(300);
		name.sendKeys("vamsi");
				Thread.sleep(300);
				String at=name.getAttribute("value");
				System.out.println("name--->"+at);
				
		
		
		
	}
	

}
