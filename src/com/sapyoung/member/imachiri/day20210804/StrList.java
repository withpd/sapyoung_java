package com.sapyoung.member.imachiri.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();

		aList.add("�Ȱ���");
		aList.add("������");
		aList.add("�ֿ���");
		aList.add("����ȭ");
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("������");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);
		// �� �̸��� ArrayList���� ���� ���� ������ ��(0��)�̹Ƿ� �� �̸��� �� ��.
	
	}
}


//�����ϰ��� �ϴ� �ܾ��� ���������� Ŭ�� -> ��Ʈ ����Ʈ �� -> �ѹ��� �����ϱ� ��������.