package com.sapyoung.member.seravision3.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;


public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList =new ArrayList();
		
		
		UserDto dto1 = new UserDto();
		dto1.setName("���1");
		dto1.setPos("����1");
		
		
		UserDto dto2 = new UserDto();
		dto2.setName("���2");
		dto2.setPos("����2");
		
		
		UserDto dto3 = new UserDto();
		dto3.setName("���3");
		dto3.setPos("����3");
		
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		
		
		
	}

}
