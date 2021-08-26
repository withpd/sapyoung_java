package com.sapyoung.member.heejung.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList();
		
		UserDto dto1 = new UserDto();
		dto1.setName("사람1");
		dto1.setPos("직급1");
		
		UserDto dto2 = new UserDto();
		dto2.setName("사람2");
		dto2.setPos("직급2");
		
		UserDto dto3 = new UserDto();
		dto3.setName("사람3");
		dto3.setPos("직급3");
		
		UserDto dto4 = new UserDto();
		dto4.setName("사람3");
		dto4.setPos("직급4");
		
		UserDto dto5 = new UserDto();
		dto5.setName("사람4");
		dto5.setPos("직급5");
		
		UserDto dto6 = new UserDto();
		dto6.setName("사람5");
		dto6.setPos("직급2");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		dtoList.add(dto5);
		dtoList.add(dto6);
		
		
		int cnt = 0;
		String name = null;
		
		String condition = "사람3";
		
		for(int b = 0; b < dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		
		if(cnt != 1) {
			System.out.println(condition + " : " + cnt + "명");
		} else {
			System.out.println("없음");
		}
		
		
	}
}
