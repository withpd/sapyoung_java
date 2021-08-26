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
	
	// try - catch 문은 오류 등 상황에 대한 예외처리를 하기 위해 작성.
	
	
	public String read(String filePath, String fileName) {
		
		File file = new File(filePath, fileName); 
		// 클래스와 이름이 같은 메소드(괄호를 포함하는 것은 메소드. 보통은 소문자로 시작) = 생성자
		// File는 txt파일을 읽어오는 메소드.
		// 생성자에는 그 안에 구체적인 지정값(파라미터)을 주어야 한다. 
		// 이때 파라미터는 파일 경로와, 파일명이다. 
		BufferedReader br; // 버퍼 방식(임시 저장소에 다운받아서 모았다가 송출하는 방법)으로 파일을 읽어올 예정.
		
		String result = "";   // line에서 읽어온 것을 result 안에 누적하라.
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			String line = "";
			
			// while문 = 괄호 안에 있는 내용을 충족할 경우, 중괄호 안의 내용을 계속 반복하자
			// readLine으로 불러온 줄의 값이 null값이 아니라면 이라는 뜻.	
			
			while( (line = br.readLine()) != null ) {
				result += line + "\n";  // \n은 엔터(한 줄 띄기)를 의미
 			}					
		} catch(Exception e) {			
		}

		return result;
	}
	
	public static void main(String[] args) {

		TxtMain tm = new TxtMain();
	
		//READ 예제
//		String res = tm.read("C:\\Users\\USER\\Desktop","test.txt");
//		System.out.println(res);

		//WRITE 예제
		tm.write("C:\\Users\\USER\\Desktop","test2.txt","This time we're going to learn about writing new files. \nWow!");
	}
}
	