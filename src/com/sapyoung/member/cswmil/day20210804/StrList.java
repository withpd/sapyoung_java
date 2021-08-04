package com.sapyoung.member.cswmil.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
//		alt + shit + R 전체 바꾸기
		
		aList.add("천성우");
		aList.add("박경수");
		aList.add("김철희");
		aList.add("김주형");
		
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("박경수");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);

	}
	
}
