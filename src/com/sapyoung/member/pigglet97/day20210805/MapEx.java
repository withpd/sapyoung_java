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
		dto1.setName("이승은");
		dto1.setPos("부장");
		
		UserDto dto2 = new UserDto();
		dto2.setName("장희정");
		dto2.setPos("차장");
		
		
		UserDto dto3 = new UserDto();
		dto3.setName("천성우");
		dto3.setPos("차장");
		
		UserDto dto4 = new UserDto();
		dto4.setName("윤수빈");
		dto4.setPos("직원");
		
		UserDto dto5 = new UserDto();
		dto5.setName("나연희");
		dto5.setPos("이사");
		
		UserDto dto6 = new UserDto();
		dto6.setName("류정훈");
		dto6.setPos("부장");
		
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
