package com.sapyoung.member.seravision3.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;


public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList =new ArrayList();
		
		
		UserDto dto1 = new UserDto();
		dto1.setName("사람1");
		dto1.setPos("직급1");
		
		
		UserDto dto2 = new UserDto();
		dto2.setName("사람2");
		dto2.setPos("직급2");
		
		
		UserDto dto3 = new UserDto();
		dto3.setName("사람3");
		dto3.setPos("직급3");
		
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		
		
		
	}

}
