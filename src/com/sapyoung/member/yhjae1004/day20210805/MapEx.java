package com.sapyoung.member.yhjae1004.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>(); // K=Key, V=Value
		
		UserDto dto1 = new UserDto();
		dto1.setName("������");
		dto1.setPos("���");
		
		UserDto dto2 = new UserDto();
		dto2.setName("������");
		dto2.setPos("���");
		
		UserDto dto3 = new UserDto();
		dto3.setName("�輺ȣ");
		dto3.setPos("����");
		
		UserDto dto4 = new UserDto();
		dto4.setName("�Ȱ���");
		dto4.setPos("�븮");
		
		map.put("yhjae1004", dto1);
		map.put("ysb0807", dto2);
		map.put("withpd", dto3);
		map.put("imachiri", dto4);
		
//		UserDto dto = map.get("yhjae1004");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + ":" + dto.getName());
		}
	}
}
