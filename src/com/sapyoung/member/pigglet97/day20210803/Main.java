package com.sapyoung.member.pigglet97.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
	//String[] strArray = new String[7];
		
		
		//	strArray[0]="값1";
		//	strArray[1]="값2";
		//	strArray[2]="값3";
		//	strArray[3]="값4";
		//	strArray[4]="값5";
		//	strArray[5]="값6";
		//	strArray[6]="값7";
		
		//	System.out.println(strArray[5]);
		
		
		UserDto[] dtoArray = new UserDto[20];
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("R&D");
		dto1.setName("이승은");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("마케팅");
		dto2.setName("천성우");
		
		UserDto dto3 = new UserDto();
		dto3.setDepartName("R&D");
		dto3.setName("장희정");
		
		UserDto dto4 = new UserDto();
		dto4.setDepartName("R&D");
		dto4.setName("유희재");
		
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;
		dtoArray[3] = dto4;
		
		UserDto resDto = dtoArray[0];
		String str = resDto.getName();
		
		
		
		
		System.out.println(str);
		
		ArrayList<UserDto> aList = new ArrayList<UserDto>();
		aList.add(dto2);
		
		aList.get(0).getName();
		
		System.out.println(aList.get(0).getName());
		
		
	}

}
