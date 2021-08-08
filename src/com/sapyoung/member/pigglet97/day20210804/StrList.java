package com.sapyoung.member.pigglet97.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("捞铰篮");
		strList.add("模备1");
		strList.add("模备2");
		strList.add("模备3");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("啊唱促");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
