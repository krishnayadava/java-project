package com.org;

import java.io.FileInputStream;

public class Readingfromexcelsheet {
	
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	fis = new FileInputStream("krishna.xls");
	workbook= new XSSFWorkbook(fis);
	
	int index= workbook.getSheetIndex("krishna");
	sheet = workbook.getSheetAt(index);
	
	row= sheet.getRow(0);
	row= getLastCellNum();
	cell=row.getCell(3);
	
	if(cell.getCellType()==Cell.Cell_TYPE_STRING){
		cell.getStringCellValue();
	}
	else if(cell.getCellType()==Cell.Cell_TYPE_NUMERIC){
		String.valueOf(cell.getNumericCellValue());
	}
	else if(cell.getCellType()==Cell.Cell_TYPE_BOOLEAN){
			String.valueOf(cell.getBooleanCellValue());
	}

}
}