package com.sapyoung.member.seoulite80.day20217029;

import com.sapyoung.company.Company;

public class Main extends Company {

	public Main() {
//		super();
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(str);
		System.out.println("Main 생성자 #1");
	}

	public Main(int num) {
		super(num);
		System.out.println("Main 생성자 #2");
	}
	
	public static void main(String[] args) {
		Main m1 = new Main();
//		Main m2 = new Main(3);
//		Main m3 = new Main("3");
		String comName = m1.getCompName();
		System.out.println("회사이름: " + comName);
	}
}
