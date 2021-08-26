package com.sapyoung.member.seoulite80.day20210823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TxtMain {
	
	public void write(String filePath, String fileName, String content) {
		File file = new File(filePath, fileName);		// 积己磊
		BufferedWriter bw;

		try {
			FileWriter writer = new FileWriter(file);
			bw = new BufferedWriter(writer);
			
			bw.write(content);
			bw.close();
		} catch(Exception e) {
		}
	}
	
	public String read(String filePath, String fileName) {
		File file = new File(filePath, fileName);		// 积己磊
		BufferedReader br;

		String line = "";
		String result = "";
		
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			while( (line = br.readLine()) != null ) {
				result += line + "\n";
			}
			
		} catch(Exception e) {
		}
		return result;
	}
	
	public static void main(String[] args) {
		TxtMain tm = new TxtMain();
		
		// READ 抗力
//		String res = tm.read("C:\\Users\\HyunKyu\\Desktop", "test.txt");
//		System.out.println(res);
		
		//WRITE 抗力
		tm.write("C:\\Users\\HyunKyu\\Desktop", "test2.xlsx", "WRITING!! \nThis is a test.");
		
	}
}
