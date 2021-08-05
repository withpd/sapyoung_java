package com.sapyoung.member.unmeblue21.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();

		UserDto dto1 = new UserDto();
		dto1.setDepartName("신사업3팀");
		dto1.setName("최일규");
		dto1.setMail("with@sapyoung.com");
		dto1.setPos("차장");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("코리아팀");
		dto2.setName("홍길동");
		dto2.setMail("korea@korea.com");
		dto2.setPos("선수");		
		
		dtoList.add(dto1);
		dtoList.add(dto2);	

		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
			System.out.println(isContain);
		
			
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size1 != 0) {
			UserDto d = dtoList.get(0);
			String mail = d.getMail();
			System.out.println(mail);
		} else {
			System.out.println("데이터 없음");
		}
		
		// i++ 은 i를 1 증가시킨다는 의미임.
		
		for(int i = 0; i < 10; i++) {
			System.out.println("for" + i);
		}
		
		for(int i = 0; i < size; i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
		}
	}
}
