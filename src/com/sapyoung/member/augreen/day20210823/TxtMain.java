package com.sapyoung.member.augreen.day20210823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TxtMain {
	
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
		File file = new File(filePath, fileName); // ������
		BufferedReader br;
		
		String result = "";
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
//			System.out.println(br.readLine());
			
			String line = "";
			
			
			while((line = br.readLine()) != null) {
				result += line + "\n";
			}				
			
		} catch(Exception e) {		
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		
		TxtMain tm = new TxtMain();
		
//		// REAE ����
//		String res = tm.read("C:\\Users\\user\\Desktop","test.txt"); 
//		System.out.println(res);
		
		// WRITE ����
		tm.write("C:\\Users\\user\\Desktop","test2.txt", "�ȳ��ϼ���!\n������ �� ������" );
		
		
		
	}
}
