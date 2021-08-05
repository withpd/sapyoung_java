package com.sapyoung.member.unmeblue21.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(2);
		intList.add(100);
		intList.add(1000);
		intList.add(9999);
	
		int size = intList.size();
		
		System.out.println(size);
		
		boolean isContain = intList.contains(9999);
		
		if(isContain == true) {
			System.out.println(true);					
		} else {
			System.out.println(false);	
		}

		int num1 = intList.get(4);
		System.out.println(num1);
	
	
	
	}
}
