package com.com.org;



import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {
	
	@Test(retryAnalyzer=com.com.org.retryAnalyzer.class)
	public void test1(){
		System.out.println("first test case executed");
		Assert.assertEquals(false, true);
	}

	@Test
	public void test2(){
		System.out.println("first test case executed");
		Assert.assertEquals(false, true);
	}

}
