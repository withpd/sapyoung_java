package com.sapyoung.member.yhjae1004.day20210727;

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
		
		dto.setName("유희재");
		dto.setDepartName("브릭스알앤디");
		dto.setFloor(3);
		dto.setId("yhjae1004");
		dto.setPos("사원");
		dto.setMail("yhjae92@ebricks.co.kr");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getMail());
		
	}
}
