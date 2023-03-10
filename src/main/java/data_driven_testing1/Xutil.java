package data_driven_testing1;




import java.io.FileInputStream;
	import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
	import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Xutil {

//		public static FileInputStream fi;
//		public static FileOutputStream fo;
//		public static XSSFWorkbook wb;
//		public static XSSFSheet ws;
//		public static XSSFRow row;
//		public static XSSFCell cell;
//		public static CellStyle style;
//		
//		public static int getRowCount(String xlfile,String xlsheet) throws Exception
//		{
//			fi = new FileInputStream(xlfile);
//			wb = new XSSFWorkbook(fi);
//			ws = wb.getSheet(xlsheet);
//			int rowcount = ws.getLastRowNum();
//			wb.close();
//			fi.close();
//			return rowcount;
//		}
//			public static int getcellCount(String xlfile,String xlsheet,int rownum) throws Exception
//			{
//				fi = new FileInputStream(xlfile);
//				wb = new XSSFWorkbook(fi);
//				ws = wb.getSheet(xlsheet);
//				row = ws.getRow(rownum);
//				int cellcount = row.getLastCellNum();
//				wb.close();
//				fi.close();
//				return cellcount;
//					}
//			public static String getcellData(String xlfile,String xlsheet,int rownum,int colnum) throws Exception
//			{
//				fi = new FileInputStream(xlfile);
//				wb = new XSSFWorkbook(fi);
//				ws = wb.getSheet(xlsheet);
//				row = ws.getRow(rownum);
//				cell = row.getCell(colnum);
//				String data;
//				try
//				{
//					DataFormatter formatter = new DataFormatter();
//					data = formatter.formatCellValue(cell);
//					return data;
//					
//				}
//				catch(Exception e)
//				{
//					data = " ";
//					
//				}
//				wb.close();
//				fi.close();
//				return data;
//			}
//				
//				public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws Exception
//				{
//					fi = new FileInputStream(xlfile);
//					wb = new XSSFWorkbook(fi);
//					ws = wb.getSheet(xlsheet);
//					row = ws.getRow(rownum);
//					cell = row.getCell(colnum);
//					cell.setCellValue(data);
//					fo = new FileOutputStream(xlfile);
//					wb.write(fo);
//					wb.close();
//					fi.close();
//					fo.close();
//					}
//	}
		
			public static FileInputStream f1;
			public static FileOutputStream f0;
			public static XSSFWorkbook wb;
			public static XSSFSheet ws;
			public static XSSFRow row;
			public static XSSFCell cell;
			public static CellStyle style;
			
			public static int getRowCount(String xlfile,String xlsheet) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb =new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				int rowcount=ws.getLastRowNum();
				wb.close();
				f1.close();
				return rowcount;		
				
			}
			public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb=new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				int cellcount=row.getLastCellNum();
				wb.close();
				f1.close();
				return cellcount;		
				
			}
			public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb=new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				cell=row.getCell(colnum);
				String data;
				try
				{
					// data-cell.toString();
					DataFormatter formatter=new DataFormatter();
					data=formatter.formatCellValue(cell);
					return data;
				}
				catch(Exception e)
				{
					data="";
				}
				wb.close();
				f1.close();
				return data;		
			}
			public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb=new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				cell=row.createCell(colnum);
				cell.setCellValue(data);
				f0=new FileOutputStream(xlfile);
				wb.write(f0);
				wb.close();
				f1.close();
				f0.close();	
				
			}
			public static void FillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb=new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				cell=row.createCell(colnum);
				style=wb.createCellStyle();
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				cell.setCellStyle(style);
				f0=new FileOutputStream(xlfile);
				wb.write(f0);
				wb.close();
				f1.close();
				f0.close();	
				
			}
			public static void FillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
			{
				f1=new FileInputStream(xlfile);
				wb=new XSSFWorkbook(f1);
				ws=wb.getSheet(xlsheet);
				row=ws.getRow(rownum);
				cell=row.createCell(colnum);
				style=wb.createCellStyle();
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				cell.setCellStyle(style);
				f0=new FileOutputStream(xlfile);
				wb.write(f0);
				wb.close();
				f1.close();
				f0.close();	
				
			}
			

		}





