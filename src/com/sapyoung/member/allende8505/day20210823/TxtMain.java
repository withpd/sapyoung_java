package com.sapyoung.member.allende8505.day20210823;

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
			FileWriter writer = new FileWriter(file);
			bw = new BufferedWriter(writer);
			
			bw.write(content);
			bw.close();
		} catch(Exception e) {
			
		}
	}
	
	public String read(String filePath, String fileName) {
		File file = new File(filePath, fileName);	//생성자
		BufferedReader br;
		
		String result = "";
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = "";
			while((line = br.readLine()) !=null) {
				result+=line + "\n";
			}
		} catch(Exception e) {
		}
		return result;
	}
	public static void main(String[] args) {
		TxtMain tm = new TxtMain();
		
		//Read Ex
//		String res = tm.read("C:\\Users\\allen\\Desktop", "test.txt");
//		System.out.println(res);
		
		//Write Ex
		tm.write("C:\\Users\\allen\\Desktop", "test2.txt", "안녕하세요! \n 휴가 다녀오니 아주 좋네요.");
		
	}
}
