package com.sapyoung.member.unmeblue21.day20210824;

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

	public void read(String path, String filename) throws IOException {
		
		FileInputStream fis = new FileInputStream(path + "\\" + filename);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
		XSSFSheet sheet = workbook.getSheetAt(0);			//	-> getSheetAt은 시트 순서로 가져오는 것
//		XSSFSheet sheet = workbook.getSheet("Sales Tax");	//	-> getSheet는 시트명으로 가져오는 것
		
//		Cell cell = sheet.getRow(3).getCell(1);  			//	-> 4행 2열(B열) 데이터 가져옴
//		System.out.println(cell);

		Iterator<Row> iter = sheet.rowIterator();
		
		while( iter.hasNext() ) {							//	while은 조건이 참이면 무조건 작동
			Row r = iter.next();
															//	for는 조건에 따른 숫자값이 맞으면 작동
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.println(c);
			}
		}
		workbook.close();
	}

	public void write(String path, String filename) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet0 = workbook.createSheet();				//	시트1번, 네이밍 자동
		Sheet sheet1 = workbook.createSheet();				//	시트2번, 네이밍 자동
		Sheet sheet2 = workbook.createSheet("시트이름");		//	시트3번, 지정 네이밍
		
		Row row0 = sheet0.createRow(0);
		Row row1 = sheet0.createRow(1);
		Row row2 = sheet0.createRow(2);

		row0.createCell(0).setCellValue("NAME");
		row0.createCell(1).setCellValue("MAIL");
		row0.createCell(2).setCellValue("Addr");

		row1.createCell(0).setCellValue("최일규");
		row1.createCell(1).setCellValue("with@sapyoung.com");
		row1.createCell(2).setCellValue("부천");
		
		row2.createCell(0).setCellValue("장동건");
		row2.createCell(1).setCellValue("jangdg@sapyoung.com");
		row2.createCell(2).setCellValue("안드로메다");		
		
		FileOutputStream fos = new FileOutputStream(path + "\\" + filename);
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		
		}
	
	public static void main(String[] args) {
		String path = "C:\\Users\\Soojung Do\\Desktop\\programmingclass";
		String filename = "writetest.xlsx";
		
		ExcelMain em = new ExcelMain();
		
		try {
//			em.read(path, filename);
			em.write(path, filename);
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("에러 발생, 파일 생성이 불가능합니다.");
		}
	}
}
