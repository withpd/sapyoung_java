package com.sapyoung.member.clara.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {

	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("�긯��");
		dto1.setMail("aslee@ebricks.co.kr");
		dto1.setName("�ּ̾�");
		dto1.setPos("��ǥ");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("bricks R&D");
		dto2.setMail("piglet@ebricks.co.kr");
		dto2.setName("�̽���");
		dto2.setPos("����");
		
		UserDto dto3 = new UserDto();
		dto3.setDepartName("bricks Marketing");
		dto3.setMail("yoon@ebricks.co.kr");
		dto3.setName("������");
		dto3.setPos("����");
	
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		
		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
			System.out.println(isContain);
			
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size1 != 0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
			System.out.println(name);
		} else {
			System.out.println("������ ����");
		}
		
		for(int i=0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
		}
				
	}
	}
