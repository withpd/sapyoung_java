package com.sapyoung.member.clara.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {

	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("브릭스");
		dto1.setMail("aslee@ebricks.co.kr");
		dto1.setName("이애숙");
		dto1.setPos("대표");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("bricks R&D");
		dto2.setMail("piglet@ebricks.co.kr");
		dto2.setName("이승은");
		dto2.setPos("부장");
		
		UserDto dto3 = new UserDto();
		dto3.setDepartName("bricks Marketing");
		dto3.setMail("yoon@ebricks.co.kr");
		dto3.setName("유정훈");
		dto3.setPos("부장");
	
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		
		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
			System.out.println(isContain);
			
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size1 != 0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
			System.out.println(name);
		} else {
			System.out.println("데이터 없음");
		}
		
		for(int i=0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
		}
				
	}
	}
