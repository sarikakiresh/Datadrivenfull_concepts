package com.read_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_Datademo {
	
	public static void column_data() throws Throwable {
		File f = new File("C:\\Users\\Sarika\\eclipse-workspace\\Datadrivenfull_concepts\\username_passworddemo.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < row_size; i++) {
		 
			Row row = sheetAt.getRow(i);
			
			int cell_size = row.getPhysicalNumberOfCells();
			Cell cell = row.getCell(0);

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
}public static void main(String[] args) throws Throwable {
column_data();
}}