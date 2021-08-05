package com.sapyoung.member.allende8505.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		UserDto dto1 = new UserDto();
		dto1.setDepartName("마케팅팀");
		dto1.setName("박동명");
		dto1.setMail("allende8505@gmail.com");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("기타");
		dto2.setName("배성호");
		dto2.setMail("withpd@gmail.com");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		int size = dtoList.size();
//		System.out.println(size);
		
		boolean inContain = dtoList.contains(dto1);
//		System.out.println(inContain);
//		
//		int size1 = dtoList.size();
//		System.out.println(size1);
//		
//		if(size1 !=0) {
//			UserDto d = dtoList.get(0);
//			String name = d.getName();
//			System.out.println(name);
//		} else {
//			System.out.println("데이터 없음");
//		}
		
		for(int i=0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
			
		}
	}

}
