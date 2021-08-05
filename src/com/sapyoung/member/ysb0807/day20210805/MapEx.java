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
		dto1.setName("�輺ȣ");
		dto1.setPos("��Ÿ");
		
		UserDto dto2 = new UserDto();
		dto2.setName("������");
		dto2.setPos("���");
		
		UserDto dto3 = new UserDto();
		dto3.setName("������");
		dto3.setPos("���");
		
		UserDto dto4 = new UserDto();
		dto4.setName("ȫ�浿");
		dto4.setPos("���");
		
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
