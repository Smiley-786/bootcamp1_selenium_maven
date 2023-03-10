package data_driven_testing1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing_class {
	public static void main(String args[]) throws IOException {
		
	
	FileOutputStream file1=new FileOutputStream(System.getProperty("user.dir")+"\\dataset1\\sheet2.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet();
	
	Scanner sc=new Scanner(System.in);
	for (int r=0;r<=3;r++) {
		XSSFRow Currentrow=sheet.createRow(r);
		for(int c=0;c<2;c++) {
			//Currentrow.createCell(c).setCellValue("welcome");
			System.out.println("enter the value");
			String value=sc.next();
			Currentrow.createCell(c).setCellValue(value);	
		}
	}
	workbook.write(file1);
	workbook.close();
	file1.close();
	System.out.println("writing is done");
	}}
