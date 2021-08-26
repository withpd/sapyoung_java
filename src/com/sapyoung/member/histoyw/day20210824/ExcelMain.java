package com.sapyoung.member.histoyw.day20210824;

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
//		Cell cell = sheet.getRow(6).getCell(1);
//		System.out.println(cell);
		
		Iterator<Row> iter = sheet.rowIterator();
		
		while( iter.hasNext() ) {
			Row r = iter.next();
			
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.println(c);
			}
		}
		
	}
	
	public void write(String path, String fileName) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet0 = workbook.createSheet();
		Sheet sheet1 = workbook.createSheet();
		Sheet sheet2 = workbook.createSheet("sheetName");
		
		Row row0 = sheet0.createRow(0);
		Row row1 = sheet0.createRow(1);
		Row row2 = sheet0.createRow(2);
		
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Mail");
		row0.createCell(2).setCellValue("Addr");
		
		row1.createCell(0).setCellValue("�ۿ��");
		row1.createCell(1).setCellValue("histoyw@sapyoung.com");
		row1.createCell(2).setCellValue("�������");
		
		row2.createCell(0).setCellValue("�ۿ��");
		row2.createCell(1).setCellValue("histoyw@gmail.com");
		row2.createCell(2).setCellValue("2��");
		
		FileOutputStream fos = new FileOutputStream(path + "\\" + fileName);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
	}
	
	
	public static void main(String[] args) {
		String path = "C:\\Users\\dagki\\OneDrive\\���� ȭ��";
		String fileName = "test3.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
//			em.read(path,  fileName);;
			em.write(path, fileName);
		} catch(IOException e) {
//			e.printStackTrace();
			System.out.println("�����ִ� ������ �ֽ��ϴ�.");
		}
		
	}
	
	

}
