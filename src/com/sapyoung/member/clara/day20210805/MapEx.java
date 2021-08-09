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
		dto1.setName("이애숙");
		dto1.setPos("대표");
		
		UserDto dto2 = new UserDto();
		dto2.setName("이승은");
		dto2.setPos("부장");
		
		UserDto dto3 = new UserDto();
		dto3.setName("류정훈");
		dto3.setPos("부장");
		
		UserDto dto4 = new UserDto();
		dto4.setName("나연희");
		dto4.setPos("이사");
	
		UserDto dto5 = new UserDto();
		dto3.setName("장희정");
		dto3.setPos("차장");
		
		UserDto dto6 = new UserDto();
		dto4.setName("배성호");
		dto4.setPos("강사");
		
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


