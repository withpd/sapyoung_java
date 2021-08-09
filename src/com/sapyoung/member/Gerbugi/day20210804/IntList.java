package com.sapyoung.member.Gerbugi.day20210804;

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
		System.out.println(isContain);
		
		if(isContain == true) {
			System.out.println(false);
		} else {
			System.out.println(true);
			}
		
		int num1 = intList.get(2);
		num1++;
		System.out.println(num1);
		
		
	}	
}
