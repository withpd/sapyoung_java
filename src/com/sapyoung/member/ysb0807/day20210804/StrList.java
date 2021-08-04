package com.sapyoung.member.ysb0807.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("À±¼öºó");
		strList.add("À¯ÈñÀç");
		strList.add("¹Ú¹ÌÁ¤");
		strList.add("ÀÌÃÖÈñ");
		
		int size = strList.size();		
		System.out.println(size);
		
		boolean isContain = strList.contains("°¡³ª´Ù");
		System.out.println(isContain);
		
		String myName = strList.get(0);
		System.out.println(myName);
	}
}
