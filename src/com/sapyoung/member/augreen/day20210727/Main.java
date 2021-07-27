package com.sapyoung.member.augreen.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		 
		// 기본 생성자 x
		UserDto dto = new UserDto(4);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		/*
		 * //기본 생성자 예제 dto.setName("고하영"); dto.setDepartName("아카데미"); dto.setFloor(4);
		 * dto.setId("augreen"); dto.setPos("대표"); dto.setMail("augreen@hanmail.net");
		 * 
		 * String name = dto.getName(); String pos = dto.getPos();
		 * 
		 * String result = pos + " " + name; System.out.println(result);
		 * System.out.println(dto.getMail());
		 */
	}
	
} 
