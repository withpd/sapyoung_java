package com.sapyoung.member.peepstest.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main (String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("�����л����");
		dto1.setName("�̼���");
		dto1.setMail("suji2063@gmail.com");
		dto1.setPos("���");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("�����л����");
		dto2.setName("�Ȱ���");
		dto2.setMail("suji2063@gmail.com");
		dto2.setPos("�븮");
		
	
		dtoList.add(dto1);
		dtoList.add(dto2);
		
		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
		System.out.println(isContain);
		

		
		
		for(int i=0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
			
			System.out.println("for");
			
			
			
		}
		
		
		
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
