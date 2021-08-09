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
		dto1.setName("������");
		dto1.setPos("������");
		
		UserDto dto2 = new UserDto();
		dto2.setName("������");
		dto2.setPos("�̻�");
		
		UserDto dto3 = new UserDto();
		dto3.setName("õ����");
		dto3.setPos("����");
		
		UserDto dto4 = new UserDto();
		dto4.setName("�輺ȣ");
		dto4.setPos("����");
		
		UserDto dto5 = new UserDto();
		dto5.setName("���4");
		dto5.setPos("����5");
		
		UserDto dto6 = new UserDto();
		dto6.setName("���5");
		dto6.setPos("����2");
		
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
