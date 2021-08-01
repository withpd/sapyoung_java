package com.sapyoung.member.withpd.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public Main() {
		super();
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(str);	// super = Company -> super() -> Company() & super(3) -> Company(3)
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main 생성자 #2");
	}
	
	public static void main(String[] args) {
		
		Main m1 = new Main();		// A회사
//		Main m2 = new Main(3);		// C회사
//		Main m3 = new Main("사회평론");	// B회사
		String comName = m1.getCompName();
		System.out.println("회사이름 : " + comName);
	}

}