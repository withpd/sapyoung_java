package com.sapyoung.member.pigglet97.day20210728;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {
	public static void main (String[] arg) {
		Main m = new Main();
		m.getCompName();
		String comName = m.getCompName();
		System.out.println(comName);
		
		
	/*	UserDto dto = new UserDto(); //메소드 중에 클래스이름일 경우 생성자라 함, 생성자 중에 파라미터 없는 것(기본생성자)은 생략이 가능, 기본 생성자는 리턴타입이 없다. 기본 생성자가 아닌 생성자를 쓰려면 생략불가
		dto.setName("이승은");
		dto.setDepartName("Bricks");
		dto.setFloor(3);
		dto.setId("pigglet97");
		dto.setPos("부장");
		dto.setMail("pigglet97@sapyoug.com");
		
		String name = dto.getName();
		String pos = dto.getPos();
		
		String result = pos + " " + name;
		System.out.println(result);
		System.out.println(dto.getMail());*/
	}
}
