package com.sapyoung.member.hooni7777.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto();
		
		dto.setName("������");
		dto.setDepartName("Bricks ��������");
		dto.setFloor(-1);
		dto.setId("hooni7777");
		dto.setPos("������");
		dto.setMail("jason@ebricks.co.kr");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getMail());
		System.out.println(dto.getName() + " " + dto.getPos());
		
		
	}
}
