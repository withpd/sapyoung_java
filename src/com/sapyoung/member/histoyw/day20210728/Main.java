package com.sapyoung.member.histoyw.day20210728;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company{
	
	public static void main(String[] arg) {
		Main m = new Main();
		String comName = m.getCompName();
		System.out.println(comName);
		
		
//		
//		
//		
//		
//		
//		
//		//기본생성자X
//		
//		UserDto dto = new UserDto(5);
//		String de = dto.getDepartName();
//		int f = dto.getFloor();
//		System.out.println(f + "층");
//		System.out.println(de);
//		
//		
//		
//		
//		// 기본 생성자 예제
//		
////		dto.setName("송용운");
////		
////		
////		dto.setDepartName("어린이사업부");
////		dto.setFloor(2);
////		dto.setId("histoyw");
////		dto.setPos("본부장");
////		dto.setMail("histoyw@sapyoung.com");
////		
////		String name = dto.getName();
////		String pos = dto.getPos();
////		
////		String result = pos + " " + name;
////		System.out.println(result);
////		System.out.println(dto.getMail());
//		
	}
}
