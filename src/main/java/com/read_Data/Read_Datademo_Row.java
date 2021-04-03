package com.read_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Datademo_Row {

	public static void row_Data() throws IOException {

		File f = new File("C:\\Users\\Sarika\\eclipse-workspace\\Datadrivenfull_concepts\\username_passworddemo.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
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
public static void main(String[] args) throws Throwable {
	row_Data();
}
}
