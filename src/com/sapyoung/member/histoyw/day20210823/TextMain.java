package com.sapyoung.member.histoyw.day20210823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextMain {
	
	public void write(String filePath, String fileName, String content) {
		File file = new File(filePath, fileName);
		BufferedWriter bw;
		try {
			FileWriter reader = new FileWriter(file);
			bw = new BufferedWriter(reader);
			
			bw.write(content);
			bw.close();
		} catch(Exception e) {
			
		}
	}
	
	public String read(String filePath, String fileName) {
		File file = new File(filePath, fileName);  //생성자
		BufferedReader br;
		
		String result = "";
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
//			System.out.println(br.readLine());
			
			String line = "";
			
			while( (line = br.readLine()) !=null ) {
				result += line + "\n";
			}

	
		} catch(Exception e) {
			
		}
		return result; 
	}
	
	public static void main(String[] args) {
		
		TextMain tm = new TextMain();

		// READ 예제
//		String res = tm.read("C:\\Users\\dagki\\OneDrive\\바탕 화면", "컴퓨터수업.txt");
//		System.out.println(res);
		
		// WRITE 예제
		tm.write("C:\\Users\\dagki\\OneDrive\\바탕 화면", "test2.xlsx", "송용운입니다. \n사회평론");
		
	}
}
