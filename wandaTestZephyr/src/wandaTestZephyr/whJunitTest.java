package wandaTestZephyr;

import static org.junit.Assert.*;

import org.junit.Test;

public class whJunitTest {

		@Test
		public void test1(){
			fail("Test 1 has failed");
			
		}
		
		@Test	
		public void test2(){
			
			
		}
		
		
		@Test	
		public void test3(){
			assertTrue("test 3 assert true test", 1==1);

		}
		
		@Test	
		public void test4(){
			assertFalse("test 4 assert false test", 1==0);

		}
		
		@Test	
		public void test5(){
			assertEquals("test 5 assert equals test", 1, 1);

		}
		
		@Test	
		public void test6(){
			assertNull("test 6 assert Null test", null);

		}
		
		@Test	
		public void test7(){
			assertNotNull("test 6 assert Not Null test", 814);

		}
	

}
