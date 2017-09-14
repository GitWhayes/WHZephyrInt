import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSysoutWH {
  @Test
  public void ZephyrTestWH() {
	  
		System.out.println("Hello Zephyr for Jira test");
		
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.microsoft.com");
		System.out.println("Title of web page is: " + driver.getTitle());
		driver.quit();
		
  }
}
