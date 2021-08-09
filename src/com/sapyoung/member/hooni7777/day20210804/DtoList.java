package com.sapyoung.member.hooni7777.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("마케팅팀");
		dto1.setName("류정훈");
		dto1.setMail("jason@ebricks.co.kr");
		dto1.setPos("본부장");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("마케팅팀");
		dto2.setName("천성우");
		dto2.setMail("cswmil@ebricks.co.kr");
		dto2.setPos("부장");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		int size = dtoList.size();
//		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
//		System.out.println(isContain);
		
		
		
		
		
		int size1 = dtoList.size();
		
		if(size1 != 0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
//			System.out.println(name);
		} else {
//			System.out.println("데이터없음");
			
		}
		
		for(int i = 0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);	
					
		}

	
	}
}




		