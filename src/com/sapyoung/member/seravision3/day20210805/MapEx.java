package com.sapyoung.member.seravision3.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
  public static void main(String[] args) {
	 ArrayList<String>aList = new ArrayList<>();
	 
	 HashMap<String,UserDto> map = new HashMap<>();
	 UserDto dto1 = new UserDto();
		dto1.setName("�輺ȣ");
		dto1.setPos("����");
		
		
		UserDto dto2 = new UserDto();
		dto2.setName("���2");
		dto2.setPos("����2");
		
		
		UserDto dto3 = new UserDto();
		dto3.setName("���3");
		dto3.setPos("����3");
		
       map.put("withpd", dto1);
       map.put("augreen", dto2);
       map.put("seravision3", dto3);
  
//       UserDto dto = map.get(0); 
//       System.out.println(dto.getName());
       
       
	 Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			UserDto dto = map.get(key);
			System.out.println(key + " : " + dto.getName());
		}
			
       
       
} 
}
