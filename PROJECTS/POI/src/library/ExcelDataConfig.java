package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String excelPath){
		
	
		
		try {
			File src = new File(excelPath);
			
			    fis = new FileInputStream(src);
			
			     wb= new XSSFWorkbook(fis);
			      
		    } catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public String getData(int sheetNumber, int row,int column){
		
		sheet1 = wb.getSheetAt(sheetNumber);
		String data= sheet1.getRow(row).getCell(column).getStringCellValue();
		 
		 return data;
	}

}
