package com.sapyoung.member.cswmil.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
//		alt + shit + R ��ü �ٲٱ�
		
		aList.add("õ����");
		aList.add("�ڰ��");
		aList.add("��ö��");
		aList.add("������");
		
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("�ڰ��");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);

	}
	
}
