package com.sapyoung.member.unmeblue21.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();

		strList.add("김갑");
		strList.add("이을");	
		strList.add("박병");			
		strList.add("최정");	
		
		int size = strList.size();
				
		System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		System.out.println(isContain);
		
		String name = strList.get(1);
		System.out.println(name);
				
	}
}
