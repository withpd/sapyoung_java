package com.sapyoung.member.imachiri.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
	ArrayList<Integer> intList = new ArrayList<>();
	
	intList.add(1);
	intList.add(50);
	intList.add(100);
	intList.add(1000);
	intList.add(1001);
	
//	int size = intList.size();
//	System.out.println(size);
	
	boolean isContain = intList.contains(99);
	System.out.println(isContain);
	//intList�� 99�� �����Ƿ� false�� ������.
	
	int num1 = intList.get(3);
	System.out.println(num1);
	// 3��° ���� 0,1,2,3 ����� 4��° ���̹Ƿ� 1000�� �ߴ°� ����.
	
	}


}