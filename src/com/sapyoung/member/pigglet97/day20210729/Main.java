package com.sapyoung.member.pigglet97.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
	public Main() {
		System.out.println("Main 기본생성자");
			
	}
	
	public Main(String srt) {
		super(3);
		System.out.println("Main 기본생성자 #1");
	}
	
	public Main(int num) {
		System.out.println("Main 기본생성자 #2");
	}
	
	public static void main(String[] args) {
		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("회사이름" + comName);
		
		
	}
}
