package com.sapyoung.member.allende8505.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company{
	
	public Main() {
		System.out.println("Main �⺻������");
	}
	
	public Main(String str) {
		super(str);
		System.out.println("Main ������ #1");
	}
	public Main(int num) {
		super(num);
		System.out.println("Main ������ #2");
	}
	
	public static void main(String[] args) {
		
//		Main m1 = new Main();
//		Main m2 = new Main("3");
		Main m3 = new Main(3);
		String comName = m3.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}
}
