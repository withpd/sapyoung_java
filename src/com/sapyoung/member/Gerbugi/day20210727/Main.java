package com.sapyoung.member.Gerbugi.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {

	public static void main(String[] args) {

		// 기본 생성자 X
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		
		
		// 기본 생성자 예제		
//		UserDto dto = new UserDto();
//		dto.setName("나연희");
//		dto.setDepartName("경영지원본부");
//		dto.setFloor(5);
//		dto.setId("Gerbugi");
//		dto.setPos("이사");
//		dto.setMail("gerbugi76@gmail.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
