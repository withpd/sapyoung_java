package com.sapyoung.member.heejung.day20210804;

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
		dto2.setDepartName("브릭스 R&D");
		dto2.setName("장희정");
		dto2.setMail("eena@sapyoung.com");
		dto2.setPos("차장");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
		System.out.println(isContain);
		
		
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size1 !=0) {
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
