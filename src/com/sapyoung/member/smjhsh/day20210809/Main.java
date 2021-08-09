package com.sapyoung.member.smjhsh.day20210809;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("key10", "value1");
		map.put("key22", "value2");
		map.put("key32", "value3");
		map.put("key499", "value4");
		map.put("key5", "value5");
		
		Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key);
		}
	}
	
	  
}
