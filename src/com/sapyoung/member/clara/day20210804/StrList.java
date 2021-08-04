package com.sapyoung.member.clara.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("¹è¼ºÈ£");
		strList.add("±è¼ö°â");
		strList.add("±è¹Î°â");
		strList.add("ÀÌ»ó¼º");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("°¡³ª´Ù");
		
			System.out.println(isContain);
			
			String myName = strList.get(0);
			System.out.println(myName);
	
	}
		
}
