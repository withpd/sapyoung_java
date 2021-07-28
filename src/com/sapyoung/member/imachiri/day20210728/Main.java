package com.sapyoung.member.imachiri.day20210728;

import com.sapyoung.company.Company;

// extends는 상속을 의미함
public class Main extends Company{    // main class
	public static void main(String[] arg) {    // main method. 시작지점의 역할을 하는 것으로 별 기능 없음.
		Main m = new Main(); // main class의 객체를 생성함
		String comName = m.getCompName(); // company class를 상속했으므로 main class 내 객체 안에 상속된 내용을 사용할 수 있음.
		System.out.println(comName);
	}
	
}