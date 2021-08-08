package com.sapyoung.member.imachiri.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		// K = key(데이터타입 지정해 몇 번째 데이터인지 키값 정의해줌. Array List는 알아서 순서가 정해졌지만 해시맵은 직접 정해줘야함) , V = value
		HashMap<String, UserDto> map = new HashMap<>();
		
			UserDto dto1 = new UserDto();
			dto1.setName("안가은");
			dto1.setPos("직급1");

			UserDto dto2 = new UserDto();
			dto2.setName("나연희");
			dto2.setPos("직급2");
		
			UserDto dto3 = new UserDto();
			dto3.setName("김지민");
			dto3.setPos("직급3");

			UserDto dto4 = new UserDto();
			dto4.setName("이수지");
			dto4.setPos("직급4");
		
			UserDto dto5 = new UserDto();
			dto5.setName("사람4");
			dto5.setPos("직급4");		
			
			map.put("imachiri", dto1); //첫 번째 있는 dto1 이라는 뜻
			map.put("Gerbugi", dto2);
			map.put("ecodooly8", dto3);
			map.put("peepstest", dto4);
			map.put("seoulite80", dto5);
	
			UserDto dto = map.get("imachiri");
		
			// iterator는 반복자 & hashmap에는 순서가 없기 때문에 결과값이 랜덤하게 나온다. 
			Iterator<String> iter = map.keySet().iterator();
				while (iter.hasNext()) {
					String key = iter.next();
					System.out.println(key);
				}	
	}	
}	

