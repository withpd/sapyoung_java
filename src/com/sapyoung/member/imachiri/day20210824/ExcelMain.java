package com.sapyoung.member.imachiri.day20210824;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {
	public void read(String path, String fileName) throws IOException {
		//IOException�� �ʿ��� ����: �ռ� ���� �� ���ǰ��� �ش����� �ʴ� ��찡 ���� ��, �ذ��� �������� �̷�� ��� ��ɾ�.
		FileInputStream fis = new FileInputStream(path + "\\" + fileName);
		// stream�� buffer�� �ٸ��� �ٷιٷ� �̾ �ٿ�-������ ����Ǵ� ����. buffer�� ���ͳ� ȯ���� ���� ���� �� ��Ƽ� ������ �����̶�� stream�� �ӽ� ���� ���� �ǽð� ������ �̷����.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		// ���� ��������
		XSSFSheet sheet = workbook.getSheetAt(0); // ��Ʈ ����

		
//		Cell cell = sheet.getRow(3).getCell(1); // �� ���� e.g. 4�� 2�� (0���� �� �� 3��° �࿡�� ���������� �� ������ �ִ� ��)
//		System.out.println(cell);
	
	
		Iterator<Row> iter = sheet.rowIterator(); // Iterator�� �ݺ����̹Ƿ�, �ݺ��� ���� ��Ʈ�� �ִ� ��� ���� ������ �� �ִ�. 
		while(iter.hasNext()) {
			Row r = iter.next();
			// ������ ���� �ִٸ�(������ ������) ��� �ݺ��϶�.
			
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) { // 
				Cell c = r.getCell(i);
				System.out.println(c); 
			}
			} 
	
		}

	
	public static void main(String[] args) {
		String path = "C:\\Users\\USER\\Documents\\īī���� ���� ����";
		String fileName = "test.xlsx";
		
		ExcelMain em = new ExcelMain();
		
		// �տ��� IOException���� ���ܻ����� �ڷ� �̷������, ���� try catch������ ����ó���� ����.
		try {em.read(path, fileName);
		}
		catch(IOException e) {
			e.printStackTrace();
		// printStackTrace�� �ܼ�â�� ���ܻ����� ����ϴ� �޼ҵ�.
		} 
	}
	
}
