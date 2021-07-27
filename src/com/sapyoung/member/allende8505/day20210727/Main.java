package com.sapyoung.member.allende8505.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
//		UserDto dto = new UserDto();
		//class 이름으로 된 method = 생성자(constructor). C의 constructor와는 다르다? 기본생성자(파라미터 없음) 생략 가능해서 선언하지 않음? 
		//단, 생성자는 여럿일 수 있는데, 기본 생성자 외 다른 파라미터를 가진 생성자를 쓰려고 하면 기본 생성자도 선언 해줘야 함.
		
		/* 기본생정자 아님 */
		UserDto dto = new UserDto(2);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		
		/* 기본생성자 예제 */
//		dto.setName("박동명");
//		dto.setDepartName("사평마케팅");
//		dto.setFloor(2);
//		dto.setId("allende8505");
//		dto.setPos("대리");
//		dto.setMail("allende8505@sapyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		System.out.println(dto.getMail());
	}
}
