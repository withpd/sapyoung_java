package com.sapyoung.member.imachiri.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {		// ��ȣ�� ���� �ִ� �͵��� �޼ҵ��. �޼ҵ� �̸��� �ҹ��ڷ� �����Ѵ�. 

		// �⺻ ������ ���� ���
		UserDto dto1 = new UserDto(2);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		// �⺻ ������ ����
		UserDto dto = new UserDto();				// �׷��� UserDto�� ��� Ŭ���� �̸��̱⵵ �ϱ� ������, "Ŭ���� �̸����� �� �޼ҵ�(= ������:  Ŭ���� �� ��ü�� ������ �� ���� ��)"�μ� ù ���ڸ� �빮�ڷ� ���� �� �ִ�.
													
		dto.setName("�Ȱ���");
		dto.setDepartName("�����л����");
		dto.setFloor(-1);
		dto.setId("imachiri");
		dto.setPos("�븮");
		dto.setMail("imachiri@gmail.com");

		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = name + " " + pos;
		
		System.out.println(result);
		System.out.println(dto.getMail());	
	}
	
	
	
}
