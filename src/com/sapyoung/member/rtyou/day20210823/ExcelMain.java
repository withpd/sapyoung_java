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
//		Cell cell = sheet.getRow(3).getCell(1);  //4행 2열임 0부터 시작
//		System.out.println(cell);
	
//		workbook.getSheet("Sales Tax");
//row  행, cell 열 
	
		Iterator<Row> iter = sheet.rowIterator();  //전체 엑셀 시트 출력 
		while(iter.hasNext()) {
			Row r = iter.next(); // row dp 1~마지막까지 행 정보 들어감 
			
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
