package com.sapyoung.member.rtyou.day20210823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {
	public void read(String path, String fileName)throws IOException {
		FileInputStream fis = new FileInputStream(path +"\\"+ fileName); 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
//		Cell cell = sheet.getRow(3).getCell(1);  //4�� 2���� 0���� ����
//		System.out.println(cell);
	
//		workbook.getSheet("Sales Tax");
//row  ��, cell �� 
	
		Iterator<Row> iter = sheet.rowIterator();  //��ü ���� ��Ʈ ��� 
		while(iter.hasNext()) {
			Row r = iter.next(); // row dp 1~���������� �� ���� �� 
			
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.println(c);
			}							
		}
		workbook.close();
		
		}
	
	public void write(String path, String fileName) {
		Workbook workBook = new XSSFWorkbook();
		
	}
	
	
	
	public static void main(String[] args) {
		String path = "C:\\Users\\ROSA\\Desktop";
		String FileName = "test.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
			em.read(path, FileName);		
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
