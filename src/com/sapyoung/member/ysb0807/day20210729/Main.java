package com.sapyoung.member.ysb0807.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
	
	public Main() {
			// super = Company -> super() -> Company()
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		System.out.println("Main 생성자 #2");
	}
	
	public static void main (String[] args) {

		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("회사이름 : " + comName);;
	}
}
