package com.com.org;

import org.testng.annotations.Test;

public class TestNgfeatures {
	
	
	@Test
	public void login(){
		System.out.println("login page");
	// int i=9/0;
	}
	
	
	@Test(dependsOnMethods="login")
	public void search(){
		System.out.println("search option");
	}

}

//it means that if 9/0 then search is getting skipped
