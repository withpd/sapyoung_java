package com.sapyoung.member.seoulite80.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();

		strList.add("�輺ȣ");
		strList.add("������");
		strList.add("������");
		strList.add("������");

		int size = strList.size();
		System.out.println(size);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
