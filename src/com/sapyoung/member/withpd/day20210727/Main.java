package com.sapyoung.member.withpd.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	
	public static void main(String[] args) {
		
		// 기본 생성자 X
		UserDto dto1 = new UserDto(2);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		
		// 기본 생성자 예제
		UserDto dto = new UserDto();
		dto.setName("배성호");
		dto.setName();
		dto.setName(1);
//		
//		dto.setDepartName("기타");
//		dto.setFloor(5);
//		dto.setId("withpd");
//		dto.setPos("강사");
//		dto.setMail("withpd@gmail.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
