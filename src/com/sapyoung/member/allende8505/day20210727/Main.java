package com.sapyoung.member.allende8505.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
//		UserDto dto = new UserDto();
		//class �̸����� �� method = ������(constructor). C�� constructor�ʹ� �ٸ���? �⺻������(�Ķ���� ����) ���� �����ؼ� �������� ����? 
		//��, �����ڴ� ������ �� �ִµ�, �⺻ ������ �� �ٸ� �Ķ���͸� ���� �����ڸ� ������ �ϸ� �⺻ �����ڵ� ���� ����� ��.
		
		/* �⺻������ �ƴ� */
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		
		/* �⺻������ ���� */
//		dto.setName("�ڵ���");
//		dto.setDepartName("��������");
//		dto.setFloor(2);
//		dto.setId("allende8505");
//		dto.setPos("�븮");
//		dto.setMail("allende8505@sapyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
