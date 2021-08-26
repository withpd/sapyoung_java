package com.sapyoung.member.rtyou.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("최세민");
		strList.add("장예본");
		strList.add("김소영");
		strList.add("황서범");
		
		int size = strList.size();
		//System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		System.out.println(isContain);
		
		String myName = strList.get(0); 
		System.out.println(myName);
	}
	
	//alt+shift+r을 최초 선언한 곳에서 누르면 한번에 명칭 바꾸기 가능. 
	
}
