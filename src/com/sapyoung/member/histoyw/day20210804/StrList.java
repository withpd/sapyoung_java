package com.sapyoung.member.histoyw.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add("�ۿ��");
		aList.add("�ڵ���");
		aList.add("������");
		aList.add("���Ͽ�");
		
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("������");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);
				
		
	}
}
