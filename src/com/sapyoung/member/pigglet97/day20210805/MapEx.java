package com.sapyoung.member.pigglet97.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main (String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 = new UserDto();
		dto1.setName("�̽���");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto();
		dto2.setName("������");
		dto2.setPos("����");
		
		
		UserDto dto3 = new UserDto();
		dto3.setName("õ����");
		dto3.setPos("����");
		
		UserDto dto4 = new UserDto();
		dto4.setName("������");
		dto4.setPos("����");
		
		UserDto dto5 = new UserDto();
		dto5.setName("������");
		dto5.setPos("�̻�");
		
		UserDto dto6 = new UserDto();
		dto6.setName("������");
		dto6.setPos("����");
		
		map.put("pigglet97", dto1);
		map.put("heejung", dto2);
		map.put("cswmil", dto3);
		map.put("ysb0807", dto4);
		map.put("Gerbugi", dto5);
		map.put("hooni7777", dto6);
		
		// UserDto dto = map.get("hooni7777");
		//System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
		String key= iter.next();
		UserDto dto = map.get(key);
		System.out.println(key + " : " + dto.getName());
			
		}
		
	}

}
