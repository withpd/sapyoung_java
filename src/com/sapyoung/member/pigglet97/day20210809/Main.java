package com.sapyoung.member.pigglet97.day20210809;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("key1", "value1");
		map.put("key20", "value2");
		map.put("key33", "value3");
		map.put("key499", "value4");
		map.put("key5", "value5");
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}
		
		
	}

}
