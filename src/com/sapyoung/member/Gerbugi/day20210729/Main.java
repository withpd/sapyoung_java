package com.sapyoung.member.Gerbugi.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
		
	public Main() {
		super();
		System.out.println("Main �⺻������");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main ������ #1");
	}
	
	public Main(int num) {
		System.out.println("Main ������ #2");
	}
	
	public static void main(String[] args) {
		
		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}
			
}

