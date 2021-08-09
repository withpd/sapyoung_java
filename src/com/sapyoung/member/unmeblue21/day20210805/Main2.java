package com.sapyoung.member.unmeblue21.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
			dto1.setName("장동건");
			dto1.setPos("주연");
		UserDto dto2 = new UserDto();
			dto2.setName("고소영");
			dto2.setPos("조연");
		UserDto dto3 = new UserDto();
			dto3.setName("정우성");
			dto3.setPos("단역");
		UserDto dto4 = new UserDto();
			dto4.setName("정우성");
			dto4.setPos("카메오");
		
		dtoList.add(dto1);
		dtoList.add(dto2);	
		dtoList.add(dto3);	
		dtoList.add(dto4);
		
		System.out.println(dtoList);

// ArrayList를 쓰면 결과가 잘 나오지만, DB가 너무 많을 때는 다운된다. 
// 일일이 데이터를 열어 들여다보는 형태이기 때문이다. 
// 그래서 "키"라는 개념을 적용해 진행하는 것이 좋다. 
		
		int cnt=0;
		String name = null; 
		String condition="ㅇㅁㅇㄴㅁ";
	
		for(int b=0; b<dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		if(cnt !=1) {
		System.out.println(condition + " 님은 " + cnt + "명이에요.");		
		} else {
			System.out.println(condition+" 님은 1명이에요.");
		}
	}
}
