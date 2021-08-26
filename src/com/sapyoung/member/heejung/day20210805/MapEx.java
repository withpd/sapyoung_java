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
		dto1.setName("������");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto();
		dto2.setName("���2");
		dto2.setPos("����2");
		
		UserDto dto3 = new UserDto();
		dto3.setName("���3");
		dto3.setPos("����3");
		
		UserDto dto4 = new UserDto();
		dto4.setName("���3");
		dto4.setPos("����4");
		
		UserDto dto5 = new UserDto();
		dto5.setName("���4");
		dto5.setPos("����5");
		
		UserDto dto6 = new UserDto();
		dto6.setName("���5");
		dto6.setPos("����2");
		
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
