package com.sapyoung.member.ysb0807.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("¹è¼ºÈ£");
		dto1.setPos("±âÅ¸");
		
		UserDto dto2 = new UserDto();
		dto2.setName("À±¼öºó");
		dto2.setPos("»ç¿ø");
		
		UserDto dto3 = new UserDto();
		dto3.setName("À¯ÈñÀç");
		dto3.setPos("»ç¿ø");
		
		UserDto dto4 = new UserDto();
		dto4.setName("È«±æµ¿");
		dto4.setPos("»ç¿ø");
		
		map.put("withpd", dto1);
		map.put("ysb0807", dto2);
		map.put("yhjae1004", dto3);
		map.put("smjhsh", dto4);
		
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
