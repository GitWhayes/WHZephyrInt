package wandaTestZephyr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeSeleniumTest {
	
	public static void main(String[] args){
		
		System.out.println("Wanda Test for Google SignIn");
		
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByName("q").sendKeys("cheesecake");
		driver.quit();
		
		
	
		


	}

}
