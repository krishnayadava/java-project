package com.com.org;

import org.testng.Assert;
import org.testng.annotations.Test;


    public class MyApplication {
	
	    @Test(priority=2,description="login details")
	     public void StartApp(){
		System.out.println("hey ");
		Assert.assertEquals(12, 13);
		}
	
	    @Test(dependsOnMethods="StartApp")
        public void login(){
		System.out.println("hey ");
		}
	    @Test(dependsOnMethods="login")
        public void logout(){
	    System.out.println("hey ");
	}
}
    
    //HERE method Start app will fail and will leds to skip the other two methods as they were dependent on the above one