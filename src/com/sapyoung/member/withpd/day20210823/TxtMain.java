package com.sapyoung.member.withpd.day20210823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtMain {
	
	public void write(String filePath, String fileName, String content) {
		File file = new File(filePath, fileName);
		BufferedWriter bw;
		FileWriter reader;
		try {
			reader = new FileWriter(file);
			bw = new BufferedWriter(reader);
			bw.write(content);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	public String read(String filePath, String fileName) {
		File file = new File(filePath, fileName);		// 생성자
		BufferedReader br;
		
		String result = "";
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			String line = "";
			
			while( (line = br.readLine()) != null ) {
				result += line + "\n";
			}
			
		} catch(Exception e) {
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		TxtMain tm = new TxtMain();
		
		// READ 예제
//		String res = tm.read("C:\\Users\\SPnt06\\Desktop", "SBI.txt");
//		System.out.println(res);		
		
		// WRITE 예제
		tm.write("C:\\Users\\SPnt06\\Desktop", "test2.txt", "안녕하세요!!!! \n 이제 곧 수업끝납니다 힘내세요!sdfsdfsdf");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
