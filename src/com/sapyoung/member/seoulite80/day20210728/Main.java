package com.sapyoung.member.seoulite80.day20210728;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto1 = new UserDto();
		
		dto1.setDepartName("��ī����");
		dto1.setFloor(4);
		dto1.setId("hklim");
		dto1.setMail("hklim@sapyoung.com");
		dto1.setName("������");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto(4);
		
		dto2.setId("hklim");
		dto2.setMail("hklim@sapyoung.com");
		dto2.setName("������");
		dto2.setPos("����");
		
		UserDto dto3 = new UserDto(4, "��Ÿ");
		
		dto3.setId("hklim");
		dto3.setMail("hklim@sapyoung.com");
		dto3.setName("������");
		dto3.setPos("����");
		
	}
}
