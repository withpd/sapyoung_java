package com.sapyoung.member.withpd.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	
	public static void main(String[] args) {
		
		// �⺻ ������ X
		UserDto dto1 = new UserDto(2);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		
		// �⺻ ������ ����
		UserDto dto = new UserDto();
		dto.setName("�輺ȣ");
		dto.setName();
		dto.setName(1);
//		
//		dto.setDepartName("��Ÿ");
//		dto.setFloor(5);
//		dto.setId("withpd");
//		dto.setPos("����");
//		dto.setMail("withpd@gmail.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
