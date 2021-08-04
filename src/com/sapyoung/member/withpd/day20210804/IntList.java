package com.sapyoung.member.withpd.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(100);
		intList.add(1000);
		intList.add(9999);
		
		int num1 = intList.get(2);
		num1++;
		System.out.println(num1);
	}
}
