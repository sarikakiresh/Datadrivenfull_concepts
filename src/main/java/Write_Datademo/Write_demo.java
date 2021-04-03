package Write_Datademo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_demo {
	
	public static void write_Datas() throws Throwable {

	File f = new File("C:\\Users\\Sarika\\Desktop\\Deatils_Read.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook();
	
	Sheet createSheet = wb.createSheet("Datas");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue("name");
	
	wb.getSheet("Datas").getRow(0).createCell(1).setCellValue("password");
	
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);//write
	
	System.out.println("Data write done");
	
	wb.close();//close
	

	}
public static void main(String[] args) throws Throwable {
	write_Datas();
}
}
