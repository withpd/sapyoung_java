package com.sapyoung.member.rtyou.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		
		UserDto[] dtoArray = new UserDto[20]; //20개에 대한 정보 
		
		UserDto dto1 = new UserDto(); //1개에 대한 정보, 각 객체는 독립적  
		dto1.setDepartName("부서1");	
		dto1.setName("이름1");
		
		
		UserDto dto2 = new UserDto(); //1개에 대한 정보, 각 객체는 독립적  
		dto2.setDepartName("부서2");	
		dto2.setName("이름3");
		
		UserDto dto3 = new UserDto(); //1개에 대한 정보, 각 객체는 독립적  
		dto3.setDepartName("기타");	
		dto3.setName("배성호");
			
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;

		
		UserDto resDto = dtoArray[1];
		String str = resDto.getName();
		
		System.out.println(str);
		//System.out.println(dtoArray.length);
		
		ArrayList <UserDto> aList = new ArrayList<>();
		aList.add(dto1);  //0번째
		aList.add(dto2);
		aList.add(dto3);
		
		System.out.println(aList.get(0).getName());
		
		System.out.println(aList.size());
		//위 length랑 같은 거 
		
		
//		String[] strArray = new String[7]; //str 변수에 [] 배열을 7개 할 것. 
//		
//			
//		strArray[0] = "값1";  // 사용자 측면에서는 0부터지만 개발에서는 0부터 진행
//		strArray[1] = "값2";
//		strArray[2] = "값3";
//		strArray[3] = "값4";
//		strArray[4] = "값5";
//		strArray[5] = "값6";
//		strArray[6] = "값7";
		
		
		
	}
}
