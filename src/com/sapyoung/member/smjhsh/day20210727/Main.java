package com.sapyoung.member.smjhsh.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
//		�⺻ ������ ����
//		UserDto dto = new UserDto();
//		dto.setName("Ȳ����");
//		dto.setDepartName("������");
//		dto.setFloor(2);
//		dto.setId("smjhsh");
//		dto.setPos("���");
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
