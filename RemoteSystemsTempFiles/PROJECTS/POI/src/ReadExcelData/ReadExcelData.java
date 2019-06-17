package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import library.ExcelDataConfig;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	
	public static void main(String[] args){
	
ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\krishna.yadav\\Desktop\\exceldata\\krishna.xlsx");


System.out.println(excel.getData(0,1,0));

	
	}
	}