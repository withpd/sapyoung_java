package com.sapyoung.member.clara.day20210727;

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
		dto.setName("�ּ̾�");
		dto.setDepartName("bricks");
		dto.setFloor(3);
		
//		dto.setId("clara");
//		dto.setPos("��ǥ");
//		dto.setMail("las@ebricks.co.kr");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}

