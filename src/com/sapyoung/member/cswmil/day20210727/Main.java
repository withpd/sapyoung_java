package com.sapyoung.member.cswmil.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto();
		
		dto.setName("õ����");
		dto.setDepartName("�긯�������ú���");
		dto.setFloor(-1);
		dto.setId("cswmil");
		dto.setPos("����");
		dto.setMail("cswmil@ebricks.co.kr");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name; 
		System.out.println(result);
		System.out.println(dto.getMail());
		
	}

}
