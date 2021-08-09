package com.sapyoung.member.seravision3.day20210804;

import java.util.ArrayList;

public class StrList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("배성호");
		strList.add("박동명");
		strList.add("정하연");
		strList.add("이유진");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		
		String myName = strList.get(0);
		
		System.out.println(myName);
	}
}
