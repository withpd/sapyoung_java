package com.sapyoung.member.seoulite80.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
		public static void main(String[] args) {
			String[] strArray = new String[7];
			
			strArray[0] = "값1";
			strArray[1] = "값2";
			strArray[2] = "값3";
			strArray[3] = "값4";
			strArray[4] = "값5";
			strArray[5] = "값6";
			strArray[6] = "값7";
			   
//			System.out.println(strArray[0]);
			
			UserDto[] dtoArray = new UserDto[20];
			
			UserDto dto1 = new UserDto();
			dto1.setDepartName("부서1");
			dto1.setName("이름1");
			
			UserDto dto2 = new UserDto();
			dto2.setDepartName("부서2");
			dto2.setName("이름2");

			UserDto dto3 = new UserDto();
			dto3.setDepartName("부서3");
			dto3.setName("이름3");
			
			dtoArray[0] = dto1;
			dtoArray[1] = dto2;
			dtoArray[2] = dto3;

			UserDto resDto = dtoArray[2];
			String str = resDto.getName();
			
			System.out.println(str);
			
			ArrayList<UserDto> aList = new ArrayList<UserDto>();
			aList.add(dto1);
			aList.add(dto2);
			aList.add(dto3);
			
			aList.get(0).getName();
			
			System.out.println(aList.get(0).getName());
			
		}
}
