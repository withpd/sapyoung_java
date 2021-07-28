package com.sapyoung.member.seoulite80.day20210728;

import com.sapyoung.company.Company;
// import com.sapyoung.dto.UserDto;

public class Main extends Company {
	public static void main(String[] args) {
		Main m = new Main();
		String comName = m.getCompName();
		System.out.println(comName);

		
		/*
		 * UserDto dto1 = new UserDto();
		 * 
		 * dto1.setDepartName("아카데미"); dto1.setFloor(4); dto1.setId("hklim");
		 * dto1.setMail("hklim@sapyoung.com"); dto1.setName("임현규"); dto1.setPos("과장");
		 * 
		 * UserDto dto2 = new UserDto(4);
		 * 
		 * dto2.setId("hklim"); dto2.setMail("hklim@sapyoung.com"); dto2.setName("임현규");
		 * dto2.setPos("과장");
		 * 
		 * UserDto dto3 = new UserDto(4, "기타");
		 * 
		 * dto3.setId("hklim"); dto3.setMail("hklim@sapyoung.com"); dto3.setName("임현규");
		 * dto3.setPos("과장");
		 * 
		 * System.out.println("CASE #1 Start"); UserDto dto1 = new UserDto(); String
		 * result1 = dto1.getResult(); System.out.println(result1);
		 * System.out.println("CASE #1 End \n");
		 * 
		 * System.out.println("CASE #2 Start"); UserDto dto2 = new UserDto(4); String
		 * result2 = dto2.getResult(); System.out.println(result2);
		 * System.out.println("CASE #2 End \n");
		 * 
		 * System.out.println("CASE #3 Start"); UserDto dto3 = new UserDto(4, "아카데미");
		 * String result3 = dto3.getResult(); System.out.println(result3);
		 * System.out.println("CASE #3 End \n");
		 * 
		 * UserDto dto = new UserDto(); Company com = dto.getCom(); String comName =
		 * com.getCompName(); System.out.println(comName);
		 */

	}
}
