package com.sapyoung.member.rtyou.day20210809;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
//키를 알아야 에쎄스 할수 있는데 하단 쓰면 이터에 키가 배열로 이루어져 있음. 
//링크드 해시맵은 순서대로 입력. 그냥 해시맵은 순서 아닌 랜덤으로 배열. 순서가 보장되냐 안 되냐의 차이 		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
			
			
			
			
		}
		
	}
	
	
	
	
}
