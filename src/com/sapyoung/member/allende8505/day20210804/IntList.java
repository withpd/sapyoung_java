package com.sapyoung.member.allende8505.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(10);
		intList.add(100);
		intList.add(1000);
		intList.add(10000);
		
//		int size = intList.size();
//		System.out.println(size);
		
//		boolean isContain = intList.contains(1);
//		
//		if(isContain == true) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		int num1 = intList.get(2);
		num1++;
		System.out.println(num1);
		
	}
}
