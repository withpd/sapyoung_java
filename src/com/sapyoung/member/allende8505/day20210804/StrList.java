package com.sapyoung.member.allende8505.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("박동명");
		strList.add("나연희");
		strList.add("류정훈");
		strList.add("천성우");
		
//		int size = aList.size();
//		System.out.println(size);
		
//		boolean isContain = aList.contains("박동명");
//		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
