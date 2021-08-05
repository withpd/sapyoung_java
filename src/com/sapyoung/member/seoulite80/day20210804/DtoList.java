package com.sapyoung.member.seoulite80.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();

		UserDto dto1 = new UserDto();
		dto1.setDepartName("기타");
		dto1.setName("배성호");
		dto1.setMail("withpd@gmail.com");
		dto1.setPos("강사");

		UserDto dto2 = new UserDto();
		dto2.setDepartName("아카데미");
		dto2.setName("임현규");
		dto2.setMail("hklim@sapyoung.com");
		dto2.setPos("과장");

		dtoList.add(dto1);
		dtoList.add(dto2);

		int size1 = dtoList.size();
		System.out.println(size1);

		if (size1 != 0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
			System.out.println(name);
		} else
			System.out.println("NO DATA");

		for (int i = 0; i < size1; i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
		}

	}
}
