package selin;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dropmenu {
	WebDriver odriver;
@BeforeMethod     //Annonation
	
	
	void open() {
		WebDriverManager.chromedriver().setup();
		odriver=new ChromeDriver();
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		 odriver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//odriver.get("https://blog.hubspot.com/website/html-dropdown");
		 
		
	}
	@Test
	void reg() throws InterruptedException {
	
		
		WebElement course=odriver.findElement(By.id("course"));
		Select  item         = new Select(course);
		 List< WebElement >  opt =item.getOptions();
		 for(WebElement opt2:opt) {
			 System.out.println(opt2.getText());
			 
		 }
		 item.selectByIndex(1);
		 Thread.sleep(3000);
		 item.selectByValue("net");
		 Thread.sleep(3000);
		 item.selectByVisibleText("Javascript");
		 String choice=item.getFirstSelectedOption().getText();
		 System.out.println("select"+choice);
		
		/*WebElement ideElement = odriver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);//Eclipse
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij"); //IntelliJ IDEA
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("NetBeans"); //NetBeans
		Thread.sleep(3000);
		
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text - " +selectedOption.getText());
		}	
		*/
	}
		@AfterMethod
		void qu() {
			odriver.close();
		}
}
