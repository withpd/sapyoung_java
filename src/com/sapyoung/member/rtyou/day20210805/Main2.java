package com.sapyoung.member.rtyou.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main (String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
	
		UserDto dto1 =new UserDto();
		dto1.setName("���1");
		dto1.setPos("����1");
		
		UserDto dto2 =new UserDto();
		dto2.setName("���2");
		dto2.setPos("����2");
		
		UserDto dto3 =new UserDto();
		dto3.setName("���3");
		dto3.setPos("����4");
		
		UserDto dto4 =new UserDto();
		dto4.setName("���3");
		dto4.setPos("����4");
		
		UserDto dto5 =new UserDto();
		dto5.setName("���5");
		dto5.setPos("����5");

		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		dtoList.add(dto5);
	
		  
			int cnt = 0; // ���� 2�� �ȶߵ��� �� ������ ���� ǥ�� for�� �ȿ� ������ �ȵ�
			String name = null; 
			
			String condition ="���3"; 
			
			for(int b = 0; b < dtoList.size(); b++) {
				
				UserDto dto = dtoList.get(b);
				name = dto.getName(); 
			
			if(name.equals(condition)) { //��� �ߺ��ؼ� 3 �θ��̸� ���� �ι� �� 
				cnt++; 
				//System.out.println("����");
			}						
		//	System.out.println(name);		
			
			
		}
			if(cnt != 1) {
				System.out.println(condition + ":" + cnt+"��");
				
			} else {
				System.out.println("����");
				
			}
			
			
	}
}

 



