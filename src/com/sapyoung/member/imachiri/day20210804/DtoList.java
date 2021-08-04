package com.sapyoung.member.imachiri.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {

	public static void main(String[] args) {
	ArrayList<UserDto> dtoList = new ArrayList<>();
	
	UserDto dto1 = new UserDto();
	dto1.setDepartName("디지털사업팀");
	dto1.setName("안가은");
	dto1.setFloor(-1);
	dto1.setMail("gean716@gmail.com");

	UserDto dto2 = new UserDto();
	dto2.setDepartName("디지털사업팀");
	dto2.setName("김지민");
	dto2.setFloor(-1);
	dto2.setMail("ecodooly8@gmail.com");

	UserDto dto3 = new UserDto();
	dto3.setDepartName("디지털사업팀");
	dto3.setName("이수지");
	dto3.setFloor(-1);
	dto3.setMail("pppp@gmail.com");
	
	dtoList.add(dto1);
	dtoList.add(dto2);
	dtoList.add(dto3);
	
	boolean isContain = dtoList.contains(dto1);
	System.out.println(isContain);		

	int size1 = dtoList.size();
//	System.out.println(size1);
		
	if(size1 != 0) {
		UserDto d = dtoList.get(0);
		String name = d.getName();
		System.out.println(name);
	} else { System.out.println("데이터 없음");}
	
	//for 문은 반복문. i값을 초기화 하고, i값이 10보다 작을 때, i에 1을 더한다. ++는 1 증가한다는 말.
	for(int i=0; i < dtoList.size(); i++) {
		UserDto d = dtoList.get(i);
		String name = d.getName();
		System.out.println(name);
	}
	
	
	}
}
