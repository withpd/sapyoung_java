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
			
		XSSFSheet sheet = workbook.getSheetAt(0);			//	-> getSheetAt�� ��Ʈ ������ �������� ��
//		XSSFSheet sheet = workbook.getSheet("Sales Tax");	//	-> getSheet�� ��Ʈ������ �������� ��
		
//		Cell cell = sheet.getRow(3).getCell(1);  			//	-> 4�� 2��(B��) ������ ������
//		System.out.println(cell);

		Iterator<Row> iter = sheet.rowIterator();
		
		while( iter.hasNext() ) {							//	while�� ������ ���̸� ������ �۵�
			Row r = iter.next();
															//	for�� ���ǿ� ���� ���ڰ��� ������ �۵�
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.println(c);
			}
		}
		workbook.close();
	}

	public void write(String path, String filename) throws IOException {
		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet0 = workbook.createSheet();				//	��Ʈ1��, ���̹� �ڵ�
		Sheet sheet1 = workbook.createSheet();				//	��Ʈ2��, ���̹� �ڵ�
		Sheet sheet2 = workbook.createSheet("��Ʈ�̸�");		//	��Ʈ3��, ���� ���̹�
		
		Row row0 = sheet0.createRow(0);
		Row row1 = sheet0.createRow(1);
		Row row2 = sheet0.createRow(2);

		row0.createCell(0).setCellValue("NAME");
		row0.createCell(1).setCellValue("MAIL");
		row0.createCell(2).setCellValue("Addr");

		row1.createCell(0).setCellValue("���ϱ�");
		row1.createCell(1).setCellValue("with@sapyoung.com");
		row1.createCell(2).setCellValue("��õ");
		
		row2.createCell(0).setCellValue("�嵿��");
		row2.createCell(1).setCellValue("jangdg@sapyoung.com");
		row2.createCell(2).setCellValue("�ȵ�θ޴�");		
		
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
			System.out.println("���� �߻�, ���� ������ �Ұ����մϴ�.");
		}
	}
}
