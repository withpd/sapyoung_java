package com.sapyoung.member.augreen.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("고하영");
		strList.add("정미");
		strList.add("이은주");
		strList.add("이소영");
		
		int size = strList.size();		
		System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
		
	}

}
