package com.sapyoung.member.unmeblue21.day20210727;

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
		
//		UserDto dto = new UserDto();
//		dto.setName("최일규");
//		dto.setDepartName("신사업3팀");
//		dto.setFloor(4);
//		dto.setId("unmeblue21");
//		dto.setPos("차장");
//		dto.setMail("with@sapyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();	
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
	
}
