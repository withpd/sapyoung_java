package com.sapyoung.member.unmeblue21.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();

		UserDto dto1 = new UserDto();
		dto1.setDepartName("�Ż��3��");
		dto1.setName("���ϱ�");
		dto1.setMail("with@sapyoung.com");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("�ڸ�����");
		dto2.setName("ȫ�浿");
		dto2.setMail("korea@korea.com");
		dto2.setPos("����");		
		
		dtoList.add(dto1);
		dtoList.add(dto2);	

		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
			System.out.println(isContain);
		
			
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size1 != 0) {
			UserDto d = dtoList.get(0);
			String mail = d.getMail();
			System.out.println(mail);
		} else {
			System.out.println("������ ����");
		}
		
		// i++ �� i�� 1 ������Ų�ٴ� �ǹ���.
		
		for(int i = 0; i < 10; i++) {
			System.out.println("for" + i);
		}
		
		for(int i = 0; i < size; i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
		}
	}
}
