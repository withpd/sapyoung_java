package com.sapyoung.member.clara.day20210728;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main  extends Company {				// 상속 받기
	
	public static void main(String[] args) {
		Main m = new Main();
		String comname = m.getCompName();
		System.out.println(comname);
	
		// 기본 생성자 X
//		UserDto dto1 = new UserDto(3);
//		String de = dto1.getDepartName();
//		int f = dto1.getFloor();
//		System.out.println(f + "층");
//		System.out.println(de);
		
		
		// 기본 생성자 예제
//		UserDto dto = new UserDto();
		
//		dto.setName("이애숙");
//		dto.setName();
//		dto.setName(1);
		
		
//		dto.setName("이애숙");
//		dto.setDepartName("Bricks");
//		dto.setFloor(3);
//		dto.setId("clara");
//		dto.setPos("대표");
//		dto.setMail("aslee@ebricks.co.kr");
		
//		String name = dto.getName();
//		String pos = dto.getPos();
		
//		String result = pos + " " + name;
		
//		System.out.println(result);
//		System.out.println(dto.getMail());
		
//		int floor = dto.getFloor();
//		String de = dto.getDepartName();
//		String id = dto.getId();
//		
//		System.out.println(dto.getFloor() + " " + dto.getDepartName());
//	
//		System.out.print(dto.getId());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
