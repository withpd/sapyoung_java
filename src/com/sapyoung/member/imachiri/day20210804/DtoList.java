package com.sapyoung.member.imachiri.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {

	public static void main(String[] args) {
	ArrayList<UserDto> dtoList = new ArrayList<>();
	
	UserDto dto1 = new UserDto();
	dto1.setDepartName("�����л����");
	dto1.setName("�Ȱ���");
	dto1.setFloor(-1);
	dto1.setMail("gean716@gmail.com");

	UserDto dto2 = new UserDto();
	dto2.setDepartName("�����л����");
	dto2.setName("������");
	dto2.setFloor(-1);
	dto2.setMail("ecodooly8@gmail.com");

	UserDto dto3 = new UserDto();
	dto3.setDepartName("�����л����");
	dto3.setName("�̼���");
	dto3.setFloor(-1);
	dto3.setMail("pppp@gmail.com");
	
	dtoList.add(dto1);
	dtoList.add(dto2);
	dtoList.add(dto3);
	
	boolean isContain = dtoList.contains(dto1);
	System.out.println(isContain);		

	int size1 = dtoList.size();
//	System.out.println(size1);
		
	if(size1 != 0) {
		UserDto d = dtoList.get(0);
		String name = d.getName();
		System.out.println(name);
	} else { System.out.println("������ ����");}
	
	//for ���� �ݺ���. i���� �ʱ�ȭ �ϰ�, i���� 10���� ���� ��, i�� 1�� ���Ѵ�. ++�� 1 �����Ѵٴ� ��.
	for(int i=0; i < dtoList.size(); i++) {
		UserDto d = dtoList.get(i);
		String name = d.getName();
		System.out.println(name);
	}
	
	
	}
}
