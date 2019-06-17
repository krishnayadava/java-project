package com.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingAfileFromOtherPoint {
	
	
	public static void main(String[] args) throws IOException{
		
		
		Properties 	p = new Properties();   //we have created the object of properties
		
		File file = new File(System.getProperty("user.dir") + "/or.roperties");
		
		FileInputStream	input = new FileInputStream(file);
		
		p.load(input);
		
		
		System.out.println(p.getProperty("username"));
		
		
	}

}
