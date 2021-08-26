package com.sapyoung.member.hooni7777.day20210824;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {
	
	public void read(String path, String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(path + "\\" + fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
//		Cell cell = sheet.getRow(3).getCell(0);
//		System.out.println(cell);
//		workbook.getSheet("Sheet1");
		
		Iterator<Row> iter = sheet.rowIterator();
		
		while(iter.hasNext()) {
			Row r = iter.next();
			
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.println(c);
				
			}
			
		}
		workbook.close();
	}
	
	public void write(String path, String fileName) throws IOException {
		Workbook workBook = new XSSFWorkbook();
		
		Sheet sheet0 = workBook.createSheet();
		Sheet sheet1 = workBook.createSheet();
		Sheet sheet2 = workBook.createSheet("sheetName");
		
		Row row0 = sheet0.createRow(0);
		Row row1 = sheet0.createRow(1);
		Row row2 = sheet0.createRow(2);
		
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Mail");
		row0.createCell(2).setCellValue("Addr");
		
		row1.createCell(0).setCellValue("·ùÁ¤ÈÆ");
		row1.createCell(1).setCellValue("jason@ebricks.co.kr");
		row1.createCell(2).setCellValue("¼­¿ï");
		
		row2.createCell(0).setCellValue("¸ù¸ù");
		row2.createCell(1).setCellValue("asdf@gmail.com");
		row2.createCell(2).setCellValue("±¤ÁÖ");
		
		FileOutputStream fos = new FileOutputStream(path + "\\" + fileName);
		workBook.write(fos);
		fos.close();
		workBook.close();
		
		
	}
	
	
	public static void main(String[] args) {
		String path = "C:\\Users\\JH\\Desktop";
		String fileName = "testWrite.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
//			em.read(path, fileName);
			em.write(path, fileName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
