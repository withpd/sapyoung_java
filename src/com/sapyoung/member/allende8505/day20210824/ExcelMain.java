package com.sapyoung.member.allende8505.day20210824;

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
//		Cell cell = sheet.getRow(3).getCell(1);
//		System.out.println(cell);
		
		Iterator<Row> iter = sheet.rowIterator();
		
		while(iter.hasNext()) {
			Row r = iter.next();
			
			for(int i=0; i<r.getPhysicalNumberOfCells(); i++) {
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
		
		row1.createCell(0).setCellValue("박동명");
		row1.createCell(1).setCellValue("dm8505@sapyoung.com");
		row1.createCell(2).setCellValue("고양시");
		
		row2.createCell(0).setCellValue("배성호");
		row2.createCell(1).setCellValue("withpd@gmail.com");
		row2.createCell(2).setCellValue("인천시");
		
		FileOutputStream fos = new FileOutputStream(path + "\\" + fileName);
		workBook.write(fos);
		fos.close();
		workBook.close();
		
	}
	
	public static void main(String[] args) {
		String path = "C:\\Users\\allen\\Desktop";
		String fileName = "write.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
//			em.read(path, fileName);
			em.write(path, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
