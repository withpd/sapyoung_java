package com.sapyoung.member.imachiri.day20210823;

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
			
		}
		catch(Exception e){}
	}
	
	// try - catch ���� ���� �� ��Ȳ�� ���� ����ó���� �ϱ� ���� �ۼ�.
	
	
	public String read(String filePath, String fileName) {
		
		File file = new File(filePath, fileName); 
		// Ŭ������ �̸��� ���� �޼ҵ�(��ȣ�� �����ϴ� ���� �޼ҵ�. ������ �ҹ��ڷ� ����) = ������
		// File�� txt������ �о���� �޼ҵ�.
		// �����ڿ��� �� �ȿ� ��ü���� ������(�Ķ����)�� �־�� �Ѵ�. 
		// �̶� �Ķ���ʹ� ���� ��ο�, ���ϸ��̴�. 
		BufferedReader br; // ���� ���(�ӽ� ����ҿ� �ٿ�޾Ƽ� ��Ҵٰ� �����ϴ� ���)���� ������ �о�� ����.
		
		String result = "";   // line���� �о�� ���� result �ȿ� �����϶�.
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			String line = "";
			
			// while�� = ��ȣ �ȿ� �ִ� ������ ������ ���, �߰�ȣ ���� ������ ��� �ݺ�����
			// readLine���� �ҷ��� ���� ���� null���� �ƴ϶�� �̶�� ��.	
			
			while( (line = br.readLine()) != null ) {
				result += line + "\n";  // \n�� ����(�� �� ���)�� �ǹ�
 			}					
		} catch(Exception e) {			
		}

		return result;
	}
	
	public static void main(String[] args) {

		TxtMain tm = new TxtMain();
	
		//READ ����
//		String res = tm.read("C:\\Users\\USER\\Desktop","test.txt");
//		System.out.println(res);

		//WRITE ����
		tm.write("C:\\Users\\USER\\Desktop","test2.txt","This time we're going to learn about writing new files. \nWow!");
	}
}
	