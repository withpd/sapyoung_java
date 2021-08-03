package com.sapyoung.member.withpd.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;
import com.sapyoung.member.withpd.day20210726.WithpdDto;

public class Main {
	public static void main(String[] args) {
		String[] strArray = new String[7];
		
		
		
//		strArray[0] = "값1";
		strArray[1] = "값2";
		strArray[2] = "값3";
		strArray[3] = "값4";
		strArray[4] = "값5";
		strArray[5] = "값6";
		strArray[6] = "값7";
		
//		System.out.println(strArray[5]);
//		
		
		UserDto[] dtoArray = new UserDto[20]; 
		
		UserDto dto1 = new UserDto();
		dto1.setDepartName("부서1");
		dto1.setName("이름1");
		
		UserDto dto2 = new UserDto();
		dto2.setDepartName("부서2");
		dto2.setName("이름3");
		
		UserDto dto3 = new UserDto();
		dto3.setDepartName("기타");
		dto3.setName("배성호");
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;
		
		System.out.println(dtoArray.length);
		
//		UserDto resDto = dtoArray[3];
//		String str = resDto.getName();
//		
//		System.out.println(str);
		
		
		int sss;
		
		ArrayList<UserDto> aList = new ArrayList<>(); 
		aList.add(dto1);
		aList.add(dto2);
		aList.add(dto3);
		
		System.out.println(aList.get(0).getName());
	}
}
