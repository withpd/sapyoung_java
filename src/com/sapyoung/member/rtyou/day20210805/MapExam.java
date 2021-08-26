package com.sapyoung.member.rtyou.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapExam {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 =new UserDto();
		dto1.setName("배성호");
		dto1.setPos("강사");
		
		UserDto dto2 =new UserDto();
		dto2.setName("사람2");
		dto2.setPos("과장");
		
		UserDto dto3 =new UserDto();
		dto3.setName("사람3");
		dto3.setPos("차장");
		
		UserDto dto4 =new UserDto();
		dto4.setName("사람4");
		dto4.setPos("본부장");
		
		UserDto dto5 =new UserDto();
		dto5.setName("사람5");
		dto5.setPos("직급5");
		
		map.put("withpd", dto1);   //맵 선언
		map.put("a", dto2);
		map.put("b", dto3);
		map.put("c", dto4);
		map.put("d", dto5);
		
//		UserDto dto = map.get("a");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key =iter.next();
			UserDto dto = map.get(key);
			System.out.println(key +":" + dto.getName());
			
		}
		
		
	}
	// 맵 , 키와 밸류 , 키는 밸류를 찾는 힌트고 어레이 들어가는 값이 밸류, 맵은 키를 알아야함  
}	// 맵과 어레이 리스트 차이. 데이터 관리 구조의 특징과 포맷을 고려 필요. 어레이는 줄, 맵은 산발적 데이터에서 픽업
