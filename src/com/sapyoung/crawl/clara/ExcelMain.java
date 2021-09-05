package com.sapyoung.crawl.clara;

import java.io.FileInputStream;
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
	public void read(String path, String fileName) throws IOException  {
		FileInputStream fis = new FileInputStream(path + "\\" + fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> iter = sheet.rowIterator();
		
		while( iter.hasNext() ) {
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
		
		row1.createCell(0).setCellValue("이애숙");
		row1.createCell(1).setCellValue("aslee@ebricks.co.kr");
		row1.createCell(2).setCellValue("서울");
		
		row2.createCell(0).setCellValue("김형식");
		row2.createCell(1).setCellValue("vicelino@etomato.com");
		row2.createCell(2).setCellValue("서울");
		
		FileOutputStream fos = new FileOutputStream(path + "\\" + fileName);
		workBook.write(fos);
		fos.close();
		workBook.close();
		
	}
	
	public static void main(String[] args) {
		String path = "C:\\Users\\SPnt06\\Desktop";
		String fileName = "write.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
			em.write(path, fileName);
		} catch(IOException e) {
			System.out.println("열려 있는 파일이 있습니다.");
		}
	}
	
	
	
	
	
	
	
	
}
