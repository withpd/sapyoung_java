package com.sapyoung.member.unmeblue21.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
	 
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
		UserDto dto5 = new UserDto();
			dto5.setName("이정재");
			dto5.setPos("주연");
	
		map.put("idaaa", dto1);
		map.put("idbbb", dto2);	
		map.put("idccc", dto3);	
		map.put("idddd", dto4);
		map.put("ideee", dto5);
				
//		UserDto dto = map.get("idaaa");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
	}
}
