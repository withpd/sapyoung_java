package com.sapyoung.member.histoyw.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		//�⺻������X
		
		UserDto dto = new UserDto(5);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		
		
		
		// �⺻ ������ ����
		
//		dto.setName("�ۿ��");
//		
//		
//		dto.setDepartName("��̻����");
//		dto.setFloor(2);
//		dto.setId("histoyw");
//		dto.setPos("������");
//		dto.setMail("histoyw@sapyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
		
	}
}
