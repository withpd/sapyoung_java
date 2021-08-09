package com.sapyoung.member.hooni7777.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("류정훈");
		dto1.setPos("본부장");
		
		UserDto dto2 = new UserDto();
		dto2.setName("나연희");
		dto2.setPos("이사");
		
		UserDto dto3 = new UserDto();
		dto3.setName("천성우");
		dto3.setPos("부장");
		
		UserDto dto4 = new UserDto();
		dto4.setName("배성호");
		dto4.setPos("강사");
		
		UserDto dto5 = new UserDto();
		dto5.setName("사람4");
		dto5.setPos("직급5");
		
		UserDto dto6 = new UserDto();
		dto6.setName("사람5");
		dto6.setPos("직급2");
		
		map.put("hooni7777", dto1);
		map.put("nagobugi", dto2);
		map.put("cswmil", dto3);
		map.put("withpd", dto4);
		map.put("aaa", dto5);
		map.put("bbb", dto6);
		
//		UserDto dto = map.get("withpd");
//		System.out.println(dto.getName() + " " + dto.getPos());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
		
		
		
	}
}
