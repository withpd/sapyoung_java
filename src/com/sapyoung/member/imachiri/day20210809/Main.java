package com.sapyoung.member.imachiri.day20210809;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
			//LinkedHashMap의 경우 해시맵을 랜덤하지 않고, 순서대로 송출하게 해주는 코드다
		    //키값 앞 뒤로 해당 키값의 앞은 누구, 뒤에는 누구 라는 정보가 삽입된 채로 데이터가 배열되어있는 맵이라고 볼 수 있음.
			LinkedHashMap<String, String> map = new LinkedHashMap<>();
			map.put("key15", "value1");
			map.put("key2", "value2");
			map.put("key38", "value3");
			map.put("key400", "value4");

			Iterator<String> iter = map.keySet().iterator();
			
			// for, while문은 반복문으로서 똑같은 행위를 반복하게 만드는 문장임.
			while(iter.hasNext()) {
				String key = iter.next();
				System.out.println(key);
				
			}
	}
}
		