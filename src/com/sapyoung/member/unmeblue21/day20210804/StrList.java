package com.sapyoung.member.unmeblue21.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();

		strList.add("�谩");
		strList.add("����");	
		strList.add("�ں�");			
		strList.add("����");	
		
		int size = strList.size();
				
		System.out.println(size);
		
		boolean isContain = strList.contains("������");
		System.out.println(isContain);
		
		String name = strList.get(1);
		System.out.println(name);
				
	}
}
