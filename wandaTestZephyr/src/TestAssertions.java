import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssertions {
 
	  
		@Test
		public void test1(){
			System.out.println("\nIn Test #1");
			fail("Test 1 has failed");
			
		}
		
		@Test	
		public void test2(){
			System.out.println("Nothing in test2");
			
		}
		
		
		@Test	
		public void test3(){
			Boolean answer;
			answer = false;

			System.out.println("\nIn Test #3 \n");
			Assert.assertTrue(answer);		
			System.out.print("\nTest #3.  The Answer is: " + answer + "\n");
	
	

		}


}
