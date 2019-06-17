package com.com.org;

import org.testng.Assert;
import org.testng.annotations.Test;





public class Testng{
	
	
	@Test(priority=2,description="login details")
	public void loginApplication(){
		
		System.out.println("hey ");
		
		Assert.assertEquals(12, 13);  //compare actual result 12 with expcted is 13
		                              // here it will fail
		
		
		
	}

	
	@Test(priority=1,description="select details")
	public void SelectApplication(){
		
		System.out.println("application selected ");
		
		
		
	}

}
