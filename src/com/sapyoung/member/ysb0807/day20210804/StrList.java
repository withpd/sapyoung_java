package com.sapyoung.member.ysb0807.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("������");
		strList.add("������");
		strList.add("�ڹ���");
		strList.add("������");
		
		int size = strList.size();		
		System.out.println(size);
		
		boolean isContain = strList.contains("������");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
