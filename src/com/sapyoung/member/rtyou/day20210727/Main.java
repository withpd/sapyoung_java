package com.sapyoung.member.rtyou.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main (String[] args) {
	
		//기본 생성자 X
		UserDto dto = new UserDto();
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f+"층");
		System.out.println(de);
			
			
		}
		

//		dto.setName("최다영");
//		dto.setDepartName("기타");
//		dto.setFloor(5);
//		dto.setId("로사");
//		dto.setPos("과장");
//		dto.setMail("rosa@saypyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		
//		System.out.println(dto.getMail());
		//dto 예제 끝 
	}
	

