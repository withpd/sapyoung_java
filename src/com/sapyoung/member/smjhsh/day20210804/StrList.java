package com.sapyoung.member.smjhsh.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("배성호");
		strList.add("강길호");
		strList.add("김기령");
		strList.add("이상덕");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
