package com.sapyoung.member.histoyw.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("송용운");
		aList.add("박동명");
		aList.add("임현규");
		aList.add("고하영");
		
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("가나다");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);
				
		
	}
}
