package com.sapyoung.member.augreen.day20210728;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public static void main(String[] args) {
				 
		Main m = new Main();
		String comName = m.getCompName();
		System.out.println(comName);
		
		
		// 기본 생성자 x
		/*
		 * UserDto dto1 = new UserDto();
		 * 
		 * dto1.setDepartName("아카데미"); dto1.setFloor(4); dto1.setId("augreen");
		 * dto1.setMail("augreen@hanmail.net"); dto1.setName("고하영"); dto1.setPos("대표");
		 * 
		 * String result = dto1.getResult(); System.out.println(result);
		 * 
		 * UserDto dto2 = new UserDto(4);
		 * 
		 * dto1.setDepartName("아카데미"); dto1.setFloor(4); dto1.setId("augreen");
		 * dto1.setMail("augreen@hanmail.net"); dto1.setName("고하영"); dto1.setPos("대표");
		 * 
		 * String result = dto2.getResult(4, 아카데미); System.out.println(result);
		 * 
		 * UserDto dto3 = new UserDto();
		 * 
		 * dto1.setDepartName("아카데미"); dto1.setFloor(4); dto1.setId("augreen");
		 * dto1.setMail("augreen@hanmail.net"); dto1.setName("고하영"); dto1.setPos("대표");
		 * 
		 * String result = dto3.getResult(); System.out.println(result);
		 */
		
		/*
		 * System.out.println("CASE #1 Start"); UserDto dto1 = new UserDto(); String
		 * result1 = dto1.getResult(); System.out.println(result1);
		 * System.out.println("CASE #1 End \n");
		 * 
		 * System.out.println("CASE #2 Start"); UserDto dto2 = new UserDto(4); String
		 * result2 = dto2.getResult(); System.out.println(result2);
		 * System.out.println("CASE #2 End \n");
		 * 
		 * System.out.println("CASE #3 Start"); UserDto dto3 = new UserDto(); String
		 * result3 = dto3.getResult(4, 아데미); System.out.println(result3);
		 * System.out.println("CASE #3 End \n");
		 */
		
	      
		/*
		 * UserDto dto = new UserDto(); Company com =dto.getCom(); String comName =
		 * com.getCompName(); System.out.println(comName);
		 * 
		 */
		
		
		
		
		
		
		/*
		 * String de = dto.getDepartName(); int f = dto.getFloor(); System.out.println(f
		 * + "층"); System.out.println(de);
		 * 
		 * //기본 생성자 예제 UserDto dto = new UserDto();
		 * 
		 * dto.setName("고하영");
		 * 
		 * 
		 * //기본 생성자 예제 to.setName("고하영"); dto.setDepartName("아카데미"); dto.setFloor(4);
		 * dto.setId("augreen"); dto.setPos("대표"); dto.setMail("augreen@hanmail.net");
		 * 
		 * String name = dto.getName(); String pos = dto.getPos();
		 * 
		 * String result = pos + " " + name; System.out.println(result);
		 * System.out.println(dto.getMail());
		 */
		 
	}
	
} 
