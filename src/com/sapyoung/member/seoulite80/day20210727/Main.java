package com.sapyoung.member.seoulite80.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		
		// 기본 생성자 X
		UserDto dto1 = new UserDto(4);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		/* 기본 생성자 예시
 		 * UserDto dto = new UserDto();

		 * dto.setName("임현규"); dto.setDepartName("아카데미"); dto.setFloor(4);
		 * dto.setPos("과장"); dto.setMail("hklim@sapyoung.com");
		 * 
		 * String name = dto.getName(); String pos = dto.getPos();
		 * 
		 * String result = pos + " " + name; System.out.println(result);
		 * System.out.println(dto.getMail());
		 */
		
	}
}
