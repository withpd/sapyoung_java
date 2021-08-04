package com.sapyoung.member.unmeblue21.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.day20210728.UserDto;

// 메인은 실행만, 기능 구현은 별도의 파일에서.
// db에서 자료 불러오는 기능을 자바에선 '키' 파이썬에선 '딕셔너리'라고 부름.


public class Main {
	public static void main(String[] args)  {
		String[] strArray = new String[7];
			
		strArray[0] = "값1";
		strArray[1] = "값2";	
		strArray[2] = "값3";
		strArray[3] = "값4";
		strArray[4] = "값5";
		strArray[5] = "값6";
		strArray[6] = "값7";
		
		System.out.println(strArray[5]);
		
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
		
		UserDto dto4 = new UserDto();
		dto4.setDepartName("부서4");
		dto4.setName("이름4");
		
		UserDto dto5 = new UserDto();
		dto5.setDepartName("부서5");
		dto5.setName("이름5");
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;
		dtoArray[3] = dto4;
		dtoArray[4] = dto5;
		
		UserDto resDto = dtoArray[2];
		String str = resDto.getName();
		
		System.out.println(str);
		
		int sss;
		
		ArrayList<UserDto> aList = new ArrayList<>();
		aList.add(dto1);
		aList.add(dto2);		
		aList.add(dto3);
		aList.add(dto4);
		aList.add(dto5);

		System.out.println(aList.size());
		
	}
	
}
