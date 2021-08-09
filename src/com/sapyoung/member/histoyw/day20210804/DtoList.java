package com.sapyoung.member.histoyw.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dList= new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("어린이사업부");
		dto1.setName("송용운");
		dto1.setMail("histoyw@sapyoung.com");
		dto1.setPos("본부장");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("마케팅본부");
		dto2.setName("박동명");
		dto2.setMail("histoyw@sapyoung.com");
		dto2.setPos("대리");
		
		
		dList.add(dto1);
		dList.add(dto2);
		
//		int size = dList.size();
////		System.out.println(size);
		
		boolean isContain = dList.contains(dto1);
//		System.out.println(isContain);
		
		int size1 = dList.size();
//		System.out.println(size1);
		
		if(size1 != 0) {
			UserDto d = dList.get(0);
			String name = d.getName();
//			System.out.println(name);
			
		} else {
			System.out.println("데이터 없음");
		}
		
		for(int i=0; i < dList.size(); i++) {
			UserDto d = dList.get(i);
			String name = d.getName();
			System.out.println(name);
			
		}
		
		
	}

}
