package com.sapyoung.member.yhjae1004.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public Main() {
		super(); //기본 생성자에서는 생략 가능
		System.out.println("Main 기본 생성자");
	}
	
	public Main(String str)  {
		super(str);
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main 생성자 #2");
	}
	
	public static void main (String[] args) {

		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("회사이름 : " + comName);
	}
}
