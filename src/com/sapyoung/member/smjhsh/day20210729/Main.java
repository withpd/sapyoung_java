package com.sapyoung.member.smjhsh.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
	
	public Main() {
		
		System.out.println("Main 기본생성자");
	}
	
	public Main(String str) {
		super(3); //super = company -> super() -> company() & super(3) -> company(3)
		System.out.println("Main 생성자 #1");
	}
	
	public Main(int num) {
		System.out.println("Main 생성자 #2");
	}
	
	
	public static void main(String[] args) {
//		UserDto dto = new UserDto(5, "기타");
//		String r111 = dto.getResult();
//		System.out.println(r111);
		
		Main m1 = new Main();
		String comName = m1.getCompName();
		System.out.println("회사 이름 : " + comName);
	
	}
	
}
