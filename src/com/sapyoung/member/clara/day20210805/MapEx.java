package com.sapyoung.member.clara.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
	
		HashMap<String, UserDto> map = new HashMap<>();
				
				
		UserDto dto1 = new UserDto();
		dto1.setName("�ּ̾�");
		dto1.setPos("��ǥ");
		
		UserDto dto2 = new UserDto();
		dto2.setName("�̽���");
		dto2.setPos("����");
		
		UserDto dto3 = new UserDto();
		dto3.setName("������");
		dto3.setPos("����");
		
		UserDto dto4 = new UserDto();
		dto4.setName("������");
		dto4.setPos("�̻�");
	
		UserDto dto5 = new UserDto();
		dto3.setName("������");
		dto3.setPos("����");
		
		UserDto dto6 = new UserDto();
		dto4.setName("�輺ȣ");
		dto4.setPos("����");
		
		map.put("clara", dto1);
		map.put("pigglet97", dto2);
		map.put("hooni7777", dto3);
		map.put("Gerbugi", dto4);
		map.put("heejung", dto5);
		map.put("withpd", dto6);
		
//		UserDto dto = map.get("withpd");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
		
			System.out.println(key + ":" + dto.getName());
		
			
		}
		
	}
		
}


