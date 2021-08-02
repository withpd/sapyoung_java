package com.sapyoung.member.unmeblue21.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public Main() {
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main 생성자 #2");
	}
	
	public static void main(String[] args) {
		Main m1 = new Main();		// A회사
//		Main m2 = new Main(3);		// B회사
//		Main m3 = new Main("3");	// C회사
		String comName = m1.getCompName();
		System.out.println("회사이름 : " + comName);
	}
	
}
