package com.sapyoung.member.ecodooly8.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto();
		dto.setName("±èÁö¹Î");
		dto.setDepartName("±âÅ¸");
		dto.setFloor(5);
		dto.setId("ecodooly");
		dto.setPos("È¸»ç¿ø");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getPos());
		
	}
}
