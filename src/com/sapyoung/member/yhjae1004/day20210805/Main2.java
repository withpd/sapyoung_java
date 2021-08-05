package com.sapyoung.member.yhjae1004.day20210805;

import java.util.ArrayList;
import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList();
		
		UserDto dto1 = new UserDto();
		dto1.setName("유희재");
		dto1.setPos("사원");
		
		UserDto dto2 = new UserDto();
		dto2.setName("윤수빈");
		dto2.setPos("사원");
		
		UserDto dto3 = new UserDto();
		dto3.setName("박미정");
		dto3.setPos("사원");
		
		UserDto dto4 = new UserDto();
		dto4.setName("유희재");
		dto4.setPos("대리");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		
//		System.out.println(dtoList);
		
		int cnt = 0; //count 선언은 for문 밖에
		String name = null;
		String condition = "유희재";
		
		for(int b = 0 ; b < dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		
		if(cnt != 1) {
			System.out.println(condition + ":" + cnt + "명");
		} else {
			System.out.println("없음");
		}
	}
}
