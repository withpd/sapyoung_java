package com.sapyoung.member.seoulite80.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("��Ÿ");
		dto1.setName("�輺ȣ");
		dto1.setMail("withpd@gmail.com");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("��ī����");
		dto2.setName("������");
		dto2.setMail("hklim@sapyoung.com");
		dto2.setPos("����");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		int size = dtoList.size();
		System.out.println(size);
	}
}
