package com.sapyoung.member.Gerbugi.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {

	public static void main(String[] args) {

		// �⺻ ������ X
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		
		
		// �⺻ ������ ����		
//		UserDto dto = new UserDto();
//		dto.setName("������");
//		dto.setDepartName("�濵��������");
//		dto.setFloor(5);
//		dto.setId("Gerbugi");
//		dto.setPos("�̻�");
//		dto.setMail("gerbugi76@gmail.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
