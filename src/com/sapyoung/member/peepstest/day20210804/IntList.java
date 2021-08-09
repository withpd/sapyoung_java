package com.sapyoung.member.peepstest.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main (String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(32432);
		intList.add(14231);
		intList.add(21241);
		intList.add(2224551);

		int size = intList.size();
		System.out.println(size);
		
		boolean isContain = intList.contains(482394);
		
		int num1 = intList.get(2);
		++num1; 
		System.out.println(num1);
		
		
		
	}
}
