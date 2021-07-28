package com.sapyoung.member.smjhsh.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
//		기본 생성자 예제
//		UserDto dto = new UserDto();
//		dto.setName("황소희");
//		dto.setDepartName("국어팀");
//		dto.setFloor(2);
//		dto.setId("smjhsh");
//		dto.setPos("사원");
//		dto.setMail("smjhsh@sapyoung.com");
//
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
		
		
	}
}
