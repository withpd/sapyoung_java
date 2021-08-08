package com.sapyoung.member.allende8505.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("박동명");
		dto1.setPos("대리");
		
		UserDto dto2 = new UserDto();
		dto2.setName("송용운");
		dto2.setPos("과장");
		
		UserDto dto3 = new UserDto();
		dto3.setName("이애숙");
		dto3.setPos("대표");
		
		UserDto dto4 = new UserDto();
		dto4.setName("류정훈");
		dto4.setPos("부장");
		
		UserDto dto5 = new UserDto();
		dto5.setName("배성호");
		dto5.setPos("강사");
		
		map.put("allende8505", dto1);
		map.put("histow", dto2);
		map.put("clara", dto3);
		map.put("hooni7777", dto4);
		map.put("withpd", dto5);
		
//		UserDto dto = map.get("histow");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
	}

}
