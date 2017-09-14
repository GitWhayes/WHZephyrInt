import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestGoogleSearch {
  
  @Test
  public void GoogleSearchf() {
	
			System.out.println("Wanda Test for Google SignIn");
			
			System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			System.out.println("Title of web page is: " + driver.getTitle());
			driver.findElementByName("q").sendKeys("cheesecake");
			System.out.println("Test Complete.");
			driver.quit();
			
			
			}
	  
  
}
