package com.sapyoung.member.ysb0807.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList();
		
		UserDto dto1 = new UserDto();
		dto1.setName("������");
		dto1.setPos("���");
		
		UserDto dto2 = new UserDto();
		dto2.setName("�輺ȣ");
		dto2.setPos("����");
		
		UserDto dto3 = new UserDto();
		dto3.setName("������");
		dto3.setPos("���");
		
		UserDto dto4 = new UserDto();
		dto4.setName("������");
		dto4.setPos("���");
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		dtoList.add(dto4);
		
//		System.out.println(dtoList);
		
		int cnt = 0;
		String name = null;
		String condition = "������";
		
		for(int b = 0; b < dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		
		if(cnt != 1) {
			System.out.println(condition + " : " + cnt + "��");
			} else {
	    	System.out.println("����");
			}
	}
}
	
	
