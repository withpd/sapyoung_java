package com.sapyoung.member.seoulite80.day20210728;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		UserDto dto1 = new UserDto();
		
		dto1.setDepartName("아카데미");
		dto1.setFloor(4);
		dto1.setId("hklim");
		dto1.setMail("hklim@sapyoung.com");
		dto1.setName("임현규");
		dto1.setPos("과장");
		
		UserDto dto2 = new UserDto(4);
		
		dto2.setId("hklim");
		dto2.setMail("hklim@sapyoung.com");
		dto2.setName("임현규");
		dto2.setPos("과장");
		
		UserDto dto3 = new UserDto(4, "기타");
		
		dto3.setId("hklim");
		dto3.setMail("hklim@sapyoung.com");
		dto3.setName("임현규");
		dto3.setPos("과장");
		
	}
}
