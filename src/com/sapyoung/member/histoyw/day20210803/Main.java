package com.sapyoung.member.histoyw.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		String[] str = new String[7];		
		
		str[0] = "��1";
		str[1] = "��2";
		str[2] = "��3";
		str[3] = "��4";
		str[4] = "��5";
		str[5] = "��6";
		str[6] = "��7";
		
//		System.out.println(str[5]);
		
		UserDto[] dtoArray = new UserDto[20];
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("�μ�1");
		dto1.setName("�̸�1");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("�μ�2");
		dto2.setName("�̸�2");
		
		UserDto dto3 = new UserDto();
		dto3.setDepartName("�μ�3");
		dto3.setName("�̸�3");
		
		UserDto dto4 = new UserDto();
		dto4.setDepartName("�μ�4");
		dto4.setName("�̸�4");
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;
		
//		UserDto resDto = dtoArray[2];
//		String str = resDto.getName();
//		
//		System.out.println(str);
				
		ArrayList<UserDto> aList = new ArrayList<>();
		aList.add(dto1);
		aList.add(dto2);
		aList.add(dto3);
		
		System.out.println(aList);
	}

}
