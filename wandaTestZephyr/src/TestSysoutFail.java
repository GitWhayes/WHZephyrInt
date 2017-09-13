import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSysoutFail {
  @Test
  public void f() {
	  
		System.out.println("Wanda Test Fail");
		
		System.setProperty("webdriver.chrome.driver", "c:\\users\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www");
		System.out.println("Title of web page is: " + driver.getTitle());
		driver.quit();
		
  }
}
