package com.sapyoung.member.heejung.day20210804;

import java.util.ArrayList;

public class SrtList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("������");
		strList.add("õ����");
		strList.add("�̽���");
		strList.add("������");
		
		int size = strList.size();
		System.out.println(size);
		
		boolean isContain = strList.contains("������");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
