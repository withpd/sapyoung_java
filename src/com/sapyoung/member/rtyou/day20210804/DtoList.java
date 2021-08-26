package com.sapyoung.member.rtyou.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 =new UserDto();
		dto1.setDepartName("기타");	
		dto1.setName("배성호");
		dto1.setMail("withpd@gmail.com");
		dto1.setPos("강사");
		
		UserDto dto2 =new UserDto();
		dto2.setDepartName("기타");	
		dto2.setName("최세민");
		dto2.setMail("with@gmail.com");
		dto2.setPos("친구1");
		
		UserDto dto3 =new UserDto();
		dto3.setDepartName("기타");	
		dto3.setName("김소영");
		dto3.setMail("with@gmail.com");
		dto3.setPos("친구1");
		
		
		dtoList.add(dto1);
		dtoList.add(dto2);
		dtoList.add(dto3);
		int size = dtoList.size();
		System.out.println(size);
		
		boolean isContain = dtoList.contains(dto1);
		System.out.println(isContain);
		
		
		int size1 = dtoList.size();
		System.out.println(size1);
		
		if(size != 0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
			System.out.println(name);
					
		} else {
			System.out.println("데이터 없음");
		}
		
		for(int i=0; i < dtoList.size(); i++) {
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
			
			//for(int i=0; i < 10; i++) {
			//System.out.println("for");
			//for이 10번 출렴됨. 
			
		}
	}
	
	
	//dto는 str과 달리 이름만이 아니라 여러개의 정보를 넣은 것. 한 건의 기준이 다름 
	//contain은 명확한 값으로 말할 수 있을 때 주로 씀. dto에서는 잘 안씀. 
}



	



















