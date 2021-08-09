package com.sapyoung.member.histoyw.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(50);
		intList.add(22);
		intList.add(38);
		intList.add(9);
		
		int size = intList.size();
		System.out.println(size);
		
		boolean isContain = intList.contains(22);
		
		int num1 = intList.get(2);
		System.out.println(num1);
		
		if(isContain) {
			System.out.println(false);
		
		} else {
		
		System.out.println(true);
		}
	}

}
