package com.sapyoung.member.heejung.day20210804;

import java.util.ArrayList;

public class SrtList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("장희정");
		strList.add("천성우");
		strList.add("이승은");
		strList.add("류정훈");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("가나다");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
