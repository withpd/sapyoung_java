package com.sapyoung.member.ysb0807.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList();
		
		UserDto dto1 = new UserDto();
		dto1.setName("윤수빈");
		dto1.setPos("사원");
		
		UserDto dto2 = new UserDto();
		dto2.setName("배성호");
		dto2.setPos("강사");
		
		UserDto dto3 = new UserDto();
		dto3.setName("유희재");
		dto3.setPos("사원");
		
		UserDto dto4 = new UserDto();
		dto4.setName("유희재");
		dto4.setPos("사원");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		
//		System.out.println(dtoList);
		
		int cnt = 0;
		String name = null;
		String condition = "유희재";
		
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
	
	
