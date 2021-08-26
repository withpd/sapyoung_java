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
		//IOException이 필요한 이유: 앞서 적어 둔 조건값에 해당하지 않는 경우가 있을 시, 해결을 다음으로 미뤄라 라는 명령어.
		FileInputStream fis = new FileInputStream(path + "\\" + fileName);
		// stream은 buffer와 다르게 바로바로 이어서 다운-송출이 진행되는 형태. buffer가 인터넷 환경이 좋지 않을 때 모아서 보내기 느낌이라면 stream은 임시 저장 없이 실시간 송출이 이루어짐.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		// 파일 가져오기
		XSSFSheet sheet = workbook.getSheetAt(0); // 시트 고르기

		
//		Cell cell = sheet.getRow(3).getCell(1); // 셀 고르기 e.g. 4행 2열 (0부터 셀 떄 3번째 행에서 오른쪽으로 두 번쨰에 있는 셀)
//		System.out.println(cell);
	
	
		Iterator<Row> iter = sheet.rowIterator(); // Iterator는 반복자이므로, 반복을 통해 시트에 있는 모든 값을 가져올 수 있다. 
		while(iter.hasNext()) {
			Row r = iter.next();
			// 다음이 행이 있다면(끝나기 전까지) 계속 반복하라.
			
			for(int i=0; i < r.getPhysicalNumberOfCells(); i++) { // 
				Cell c = r.getCell(i);
				System.out.println(c); 
			}
			} 
	
		}

	
	public static void main(String[] args) {
		String path = "C:\\Users\\USER\\Documents\\카카오톡 받은 파일";
		String fileName = "test.xlsx";
		
		ExcelMain em = new ExcelMain();
		
		// 앞에서 IOException으로 예외사항을 뒤로 미뤄놨으니, 이제 try catch문으로 예외처리를 하자.
		try {em.read(path, fileName);
		}
		catch(IOException e) {
			e.printStackTrace();
		// printStackTrace는 콘솔창에 예외사항을 출력하는 메소드.
		} 
	}
	
}
