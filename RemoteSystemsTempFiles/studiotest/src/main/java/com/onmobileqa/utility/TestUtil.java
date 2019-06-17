package com.onmobileqa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.onmobileqa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=50;
	public static long IMPLICIT_WAIT= 60;

	public void SwitchToFrame(){
		driver.switchTo().frame("mainpanel");
		}
	
	@DataProvider
	public static Iterator<Object[]> getTestData() throws IOException{
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		
		File src = new File("D:\\study\\QA\\studiotest\\src\\main\\java\\com\\onmobileqa\\testdata\\Contacts.xlsx");
		
		
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
			int rowcount=sheet1.getLastRowNum(); // return total row number
			
			for (int i=0; i<rowcount+1; i++){
				
				String title=sheet1.getRow(i).getCell(0).getStringCellValue();
				String firstname=sheet1.getRow(i).getCell(1).getStringCellValue();
				String lastname=sheet1.getRow(i).getCell(2).getStringCellValue();
				String company=sheet1.getRow(i).getCell(3).getStringCellValue();
				
				
				Object ob[] = {title,firstname,lastname,company};
				myData.add(ob);
			}
			
			return myData.iterator();
	
	
}

}
