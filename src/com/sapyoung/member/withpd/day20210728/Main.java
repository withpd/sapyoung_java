package com.sapyoung.member.withpd.day20210728;

import com.sapyoung.dto.UserDto;

public class Main {
	
	public static void main(String[] args) {
//		UserDto dto1 = new UserDto();
//		
//		dto1.setDepartName("��Ÿ");
//		dto1.setFloor(5);
//		dto1.setId("withpd");
//		dto1.setMail("withpd@gmail.com");
//		dto1.setName("�輺ȣ");
//		dto1.setPos("����");
//		
//		String result = dto1.getResult();
//		System.out.println(result);
		
//		UserDto dto2 = new UserDto(2);
		
//		dto2.setId("withpd");
//		dto2.setMail("withpd@gmail.com");
//		dto2.setName("�輺ȣ");
//		dto2.setPos("����");	
		
//		String result = dto2.getResult();
//		System.out.println(result);
		
//		UserDto dto3 = new UserDto(2, "��Ÿ");
//		dto3.setId("withpd");
//		dto3.setMail("withpd@gmail.com");
//		dto3.setName("�輺ȣ");
//		dto3.setPos("����");	
		
//		String result = dto3.getResult();
//		System.out.println(result);
		
		
		System.out.println("CASE #1 Start");
		UserDto dto1 = new UserDto();
		String result1 = dto1.getResult();
		System.out.println(result1);
		System.out.println("CASE #1 End");
		System.out.println();
		
		System.out.println("CASE #2 Start");
		UserDto dto2 = new UserDto(4);
		String result2 = dto2.getResult();
		System.out.println(result2);
		System.out.println("CASE #2 End");
		System.out.println();
		
		System.out.println("CASE #3 Start");
		UserDto dto3 = new UserDto(4, "��Ÿ");
		String result3 = dto3.getResult();
		System.out.println(result3);
		System.out.println("CASE #3 End");
		
		
		
		
		
		
	}
}
