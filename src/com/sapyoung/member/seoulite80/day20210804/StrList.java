package com.sapyoung.member.seoulite80.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();

		strList.add("배성호");
		strList.add("임현규");
		strList.add("김지현");
		strList.add("윤정은");

		int size = strList.size();
		System.out.println(size);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
