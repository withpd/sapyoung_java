package com.sapyoung.member.rtyou.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("�ּ���");
		strList.add("�忹��");
		strList.add("��ҿ�");
		strList.add("Ȳ����");
		
		int size = strList.size();
		//System.out.println(size);
		
		boolean isContain = strList.contains("������");
		System.out.println(isContain);
		
		String myName = strList.get(0); 
		System.out.println(myName);
	}
	
	//alt+shift+r�� ���� ������ ������ ������ �ѹ��� ��Ī �ٲٱ� ����. 
	
}
