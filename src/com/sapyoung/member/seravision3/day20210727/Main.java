package com.sapyoung.member.seravision3.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void  main(String[]args) {
		UserDto dto = new UserDto();
		
		
		
	
		dto.setName("김세라");
		dto.setDepartName("기타");
		dto.setFloor(5);
		dto.setId("seravision3");
		dto.setPos("본부장");
		dto.setMail("seravision@gmail.com");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getMail());		
	  
	}

}

