package com.sapyoung.member.pigglet97.day20210728;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
	public static void main (String[] arg) {
		Main m = new Main();
		m.getCompName();
		String comName = m.getCompName();
		System.out.println(comName);
		
		
	/*	UserDto dto = new UserDto(); //�޼ҵ� �߿� Ŭ�����̸��� ��� �����ڶ� ��, ������ �߿� �Ķ���� ���� ��(�⺻������)�� ������ ����, �⺻ �����ڴ� ����Ÿ���� ����. �⺻ �����ڰ� �ƴ� �����ڸ� ������ �����Ұ�
		dto.setName("�̽���");
		dto.setDepartName("Bricks");
		dto.setFloor(3);
		dto.setId("pigglet97");
		dto.setPos("����");
		dto.setMail("pigglet97@sapyoug.com");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getMail());*/
	}
}
