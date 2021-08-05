package com.sapyoung.member.seoulite80.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
//		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("배성호");
		dto1.setPos("기타");

		UserDto dto2 = new UserDto();
		dto2.setName("임현규");
		dto2.setPos("과장");

		UserDto dto3 = new UserDto();
		dto3.setName("고하영");
		dto3.setPos("대표");

		UserDto dto4 = new UserDto();
		dto4.setName("사람4");
		dto4.setPos("직급4");

		UserDto dto5 = new UserDto();
		dto5.setName("사람5");
		dto5.setPos("직급5");

		UserDto dto6 = new UserDto();
		dto6.setName("사람6");
		dto6.setPos("직급6");
		
		map.put("withpd", dto1);
		map.put("seoulite", dto2);
		map.put("augreen", dto3);
		map.put("id4", dto4);
		map.put("id5", dto5);
		map.put("id6", dto6);
		
//		UserDto dto = map.get("withpd");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
				
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
				
	}
}
