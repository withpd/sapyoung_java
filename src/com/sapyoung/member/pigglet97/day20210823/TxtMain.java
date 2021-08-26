package com.sapyoung.member.pigglet97.day20210823;

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
		File file = new File(filePath, fileName);
		BufferedReader br;
		
		String  result = "";
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
	//		System.out.println(br.readLine());
			
			String line = "";
			
			while( (line = br.readLine()) != null) {
				result += line + "\n";
				
			}
		
		} catch(Exception e) {
		}
		return result; 
	}
	
	public static void main(String[] args) {
		
		//read ¿¹Á¦
		TxtMain tm = new TxtMain();
		
	//	String res = tm.read("C:\\Users\\SHO\\Desktop", "7_15.txt");
	//	System.out.println(res);
		
		//write ¿¹Á¦
		tm.write("C:\\Users\\SHO\\Desktop","test2.xlsx","¹Ý°¡¿ý¿ä! \n ¾È³ç!");
		
		
		
		
		}
}

