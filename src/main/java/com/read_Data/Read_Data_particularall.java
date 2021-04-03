package com.read_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_particularall{
 
	public static void particular_data() throws IOException {
		
		File f = new File("C:\\Users\\Sarika\\eclipse-workspace\\Datadrivenfull_concepts\\username_passworddemo.xlsx");
		
	  FileInputStream fis = new FileInputStream(f);
	 
	  Workbook wb = new XSSFWorkbook(fis);
	 
      Sheet sheetAt = wb.getSheetAt(0);
      
      Row row = sheetAt.getRow(2);
      
      Cell cell = row.getCell(1);
      
      CellType cellType = cell.getCellType();
      
      if(cellType.equals(CellType.STRING)) {
    	  
    	  String stringCellValue = cell.getStringCellValue();
    	  
    	  System.out.println(stringCellValue);
    	  
      }
      
      else if (cellType.equals(CellType.NUMERIC)){
    	
    	  double numericCellValue = cell.getNumericCellValue();
    	  
    	  int value = (int) numericCellValue;
    	  System.out.println(value);
    	  
      }
 }
	
private static void all_Data() throws Throwable {

	File f = new File("C:\\Users\\Sarika\\eclipse-workspace\\Datadrivenfull_concepts\\username_passworddemo.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheetAt = wb.getSheetAt(0);
	
int row_size = sheetAt.getPhysicalNumberOfRows();
for (int i = 0; i < row_size; i++) {
 
	Row row = sheetAt.getRow(i);
	
	int cell_size = row.getPhysicalNumberOfCells();
	for (int j = 0; j < cell_size; j++) {
		
		Cell cell = row.getCell(j);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
	 String stringCellValue = cell.getStringCellValue(); 
	 System.out.println(stringCellValue);
	 	
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int value = (int) numericCellValue;
		System.out.println(value);		
		
	}
		
	} 

}	
}
public static void main(String[] args) throws Throwable {
	particular_data();
	all_Data();
}
	
}

