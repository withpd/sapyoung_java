package com.sapyoung.member.heejung.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("장희정");
		dto1.setPos("차장");
		
		UserDto dto2 = new UserDto();
		dto2.setName("사람2");
		dto2.setPos("직급2");
		
		UserDto dto3 = new UserDto();
		dto3.setName("사람3");
		dto3.setPos("직급3");
		
		UserDto dto4 = new UserDto();
		dto4.setName("사람3");
		dto4.setPos("직급4");
		
		UserDto dto5 = new UserDto();
		dto5.setName("사람4");
		dto5.setPos("직급5");
		
		UserDto dto6 = new UserDto();
		dto6.setName("사람5");
		dto6.setPos("직급2");
		
		map.put("heejung", dto1);
		map.put("id1", dto2);
		map.put("id3", dto3);
		map.put("id5", dto4);
		map.put("id8", dto5);
		map.put("id9", dto6);
		
//		UserDto dto = map.get("heejung");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
	}

}
