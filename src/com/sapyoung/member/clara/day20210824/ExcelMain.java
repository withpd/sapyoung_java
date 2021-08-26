package com.sapyoung.member.clara.day20210824;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {
	
	public void read(String path, String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(path + "\\" + fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		Cell cell = sheet.getRow(3).getCell(1);
		System.out.println(cell);
		
//		Iterator<Row> iter = sheet.rowIterator();
//		
//		while(iter.hasNext()) {
//			Row r = iter.next();
//			
//			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
//				Cell c = r.getCell(i);
//				System.out.println(c);
				
			}
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\tiger\\OneDrive\\Desktop";
		String fileName = "test.xlsx";
		
		ExcelMain em = new ExcelMain();
		
		try {
			em.read(path, fileName);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


}
