package com.sapyoung.member.seoulite80.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();

		UserDto dto1 = new UserDto();
		dto1.setName("Person1");
		dto1.setPos("Pos1");

		UserDto dto2 = new UserDto();
		dto2.setName("Person2");
		dto2.setPos("Pos2");

		UserDto dto3 = new UserDto();
		dto3.setName("Person3");
		dto3.setPos("Pos3");

		UserDto dto4 = new UserDto();
		dto4.setName("Person3");
		dto4.setPos("Pos4");

		UserDto dto5 = new UserDto();
		dto5.setName("Person4");
		dto5.setPos("Pos5");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		dtoList.add(dto5);

		int cnt = 0;
		String name = null;
		String condition = "Person3";
		
		for (int b = 0; b < dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		
		if(cnt != 1) {
			System.out.println(condition + ": " + cnt + " People");
		} else {
			System.out.println("Not Exist");
		}
	}
}
