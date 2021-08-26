package com.sapyoung.member.rtyou.day20210823;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TxtMain {
	
	public void write(String filePath, String filename, String content) {
		File file = new File(filePath, filename); 	
		BufferedWriter bw;
		
		try {
			FileWriter reader = new FileWriter(file);
			bw = new BufferedWriter(reader);
			
			bw.write(content);
			bw.close();
			
			
		}catch(Exception e) {			
		}
	}
	
	
	public String read(String filePath, String filename) {
		File file = new File(filePath, filename);  //������ 
//		System.out.println(file.exists()); //������ �����ϴ��� ����� �޽�� 
		BufferedReader br;
	
		String result ="";		
		try {
			FileReader reader = new FileReader(file);
			br= new BufferedReader(reader);
		//	System.out.println(br.readLine());
			
			String line = "";
			while( (line = br.readLine()) != null) {
				result += line+ "\n";	
			}
			
		} catch(Exception e) {			
		}
		return result; 
	}
	
	
	public static void main(String[] args) {
	
	TxtMain tm = new TxtMain();
	//read ����
//	String res = tm.read("C:\\Users\\ROSA\\Desktop","text.txt");
//	System.out.println(res);

	//write ����
	tm.write("C:\\Users\\ROSA\\Desktop","text2.txt","till the end!!!!! \n forgodsake");
	
	
	
	}
}
