package com.sapyoung.member.histoyw.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company{
	
	public Main() {
		super();
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
//		UserDto dto = new UserDto(5, "��Ÿ");
//		String rrr = dto.getResult();
//		System.out.println(rrr);
		
		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	
	}
}
