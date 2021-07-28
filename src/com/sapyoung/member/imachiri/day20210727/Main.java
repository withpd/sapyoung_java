package com.sapyoung.member.imachiri.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {		// 괄호를 갖고 있는 것들은 메소드다. 메소드 이름은 소문자로 시작한다. 

		// 기본 생성자 없는 경우
		UserDto dto1 = new UserDto(2);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "층");
		System.out.println(de);
		
		// 기본 생성자 예제
		UserDto dto = new UserDto();				// 그런데 UserDto의 경우 클래스 이름이기도 하기 때문에, "클래스 이름으로 된 메소드(= 생성자:  클래스 내 객체를 생성할 떄 쓰는 것)"로서 첫 글자를 대문자로 삼을 수 있다.
													
		dto.setName("안가은");
		dto.setDepartName("디지털사업팀");
		dto.setFloor(-1);
		dto.setId("imachiri");
		dto.setPos("대리");
		dto.setMail("imachiri@gmail.com");

		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = name + " " + pos;
		
		System.out.println(result);
		System.out.println(dto.getMail());	
	}
	
	
	
}
