package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	
	
	@Test
	public void test1(){
		System.out.println("====test case 1 started===");
		Assert.assertEquals(12, 13); // it will fail because actual 12 is not equal to expected 13
		System.out.println("====test case 1 completed===");
	}
	
	
	
	@Test
	public void test12(){
		System.out.println("====test case 2 started===");
		Assert.assertEquals(12, 13, "both of them are not equal"); // If this test fails then only this error message will be displayed
		System.out.println("====test case 2 completed===");
	}

   
	@Test
	public void test13(){
		System.out.println("====test case 3 started===");
		Assert.assertEquals("krishna", "krishna", "both of them are not equal"); // If this test fails then only this error message will be displayed
		System.out.println("====test case 3 completed===");
	}
	
	
	@Test
	public void test14(){
		System.out.println("====test case 1 started===");
		Assert.assertTrue(true); // it will fail because actual 12 is not equal to expected 13
		System.out.println("====test case 1 completed===");
	}
	
	@Test
	public void test15(){
		System.out.println("====test case 1 started===");
		Assert.assertTrue(false); // it will fail because actual 12 is not equal to expected 13
		System.out.println("====test case 1 completed===");
	}
	
	
	@Test
	public void test16(){
		System.out.println("====test case 1 started===");
		String s= "krishna yadav";
		Assert.assertTrue(s.contains("krishna"),  "names are not matching"); // it will fail because actual 12 is not equal to expected 13
		System.out.println("====test case 1 completed===");
	}
	
}
