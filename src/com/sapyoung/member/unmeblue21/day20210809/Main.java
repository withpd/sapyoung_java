package com.sapyoung.member.unmeblue21.day20210809;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("key1", "v1");
		map.put("key2", "v2");	
		map.put("key3", "v3");	
		map.put("key4", "v4");
		map.put("key5", "v5");
		
		Iterator<String> iter = map.keySet().iterator();		
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}
	}
}
