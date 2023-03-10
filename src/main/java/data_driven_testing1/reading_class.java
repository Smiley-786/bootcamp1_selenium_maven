package data_driven_testing1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;


public class reading_class {


public static void main(String args[]) throws IOException{
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\dataset1\\sheet1.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	//Index=workbook.getSheetAt(0);
	int totalrow=sheet.getLastRowNum();
	int totalcells=sheet.getRow(1).getLastCellNum();
	
	System.out.println("numbers of rows:"+totalrow);
	System.out.println("numbers of columns:"+totalcells);
	
	for (int r=0;r<=totalrow;r++) {
		XSSFRow CurrentRow=sheet.getRow(r);	
		for(int c=0;c<totalcells;c++) {
			String value=CurrentRow.getCell(c).toString();
			System.out.print(value+"  ");
			
		}
	
		System.out.println();
		
	}
workbook.close();
file.close();
}}

//
//XSSFWorkkbook workbook=new XSSFWorkbook(file);
//XSSFSheet sheet=workbook.getSheet("sheet");
//   
//int totalrow= sheet.getLastRowNum();
//int totalcells=sheet.getRow(1).getLastCellNum();
//XSSFRow CurrentRow=sheet.getRow(r);
//String value= CurrentRow.getCell(c).toString();