package com.sapyoung.member.unmeblue21.day20210727;

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
		
//		UserDto dto = new UserDto();
//		dto.setName("���ϱ�");
//		dto.setDepartName("�Ż��3��");
//		dto.setFloor(4);
//		dto.setId("unmeblue21");
//		dto.setPos("����");
//		dto.setMail("with@sapyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();	
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
	
}
