package com.sapyoung.member.imachiri.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{

	public static void main(String[] args) {
		Main m = new Main("안녕하세요");
		String comName = m.getCompName();
		System.out.println("회사이름 : " + comName);
	}

	public Main() {
		super(); // super은 상속받는 상위 클래스. 지금 상황에서는 상속받는 클래스인 Company를 의미한다.
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		System.out.println("Main 생성자 #2");
	}
	
}