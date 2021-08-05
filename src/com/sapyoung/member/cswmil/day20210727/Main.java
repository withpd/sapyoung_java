package com.sapyoung.member.cswmil.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto();
		
		dto.setName("천성우");
		dto.setDepartName("브릭스마케팅본부");
		dto.setFloor(-1);
		dto.setId("cswmil");
		dto.setPos("차장");
		dto.setMail("cswmil@ebricks.co.kr");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name; 
		System.out.println(result);
		System.out.println(dto.getMail());
		
	}

}
