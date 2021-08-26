package com.sapyoung.member.rtyou.day20210824;

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
	
	public void write(String path, String fileName) throws IOException {
		Workbook workBook = new XSSFWorkbook();
		Sheet sheet0 = workBook.createSheet();  //�������� ��Ʈ���� 
		Sheet sheet1 = workBook.createSheet();
		Sheet sheet2 = workBook.createSheet("sheetName");
		
		Row row0 = sheet0.createRow(0);    //��Ʈ �ȿ� ���� ������ִ� �޽��  
		Row row1 = sheet0.createRow(1);
		Row row2 = sheet0.createRow(2);
		
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("Mail");
		row0.createCell(2).setCellValue("Addr");
		
		row1.createCell(0).setCellValue("Rosa");
		row1.createCell(1).setCellValue("rosa@naver.com");
		row1.createCell(2).setCellValue("����");
		
		row2.createCell(0).setCellValue("David");
		row2.createCell(1).setCellValue("david@naver.com");
		row2.createCell(2).setCellValue("����");
	
		FileOutputStream fos = new FileOutputStream(path +"\\"+ fileName); 
		workBook.write(fos);
		fos.close();
		workBook.close();
		
	}
		
	
	public static void main(String[] args) {
		String path = "C:\\Users\\ROSA\\Desktop\\program";
		String FileName = "write.xlsx";
		
		ExcelMain em = new ExcelMain();
		try {
			//em.read(path, FileName);		
			em.write(path, FileName);
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
}
