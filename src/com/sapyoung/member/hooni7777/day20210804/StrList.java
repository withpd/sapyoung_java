package com.sapyoung.member.hooni7777.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("������");
		strList.add("������");
		strList.add("õ����");
		strList.add("������");
		
		int size = strList.size();
//		System.out.println(size);
		
		boolean isContain = strList.contains("������");
//		System.out.println(isContain);
	
		String myName = strList.get(3);
		System.out.println(myName);
		
		
	
	}
	
}
