package com.sapyoung.member.withpd.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(8);		// 0번째
		intList.add(243);	// 1번째
		intList.add(3939);	// 2번째
		intList.add(3123);
		intList.add(100);
		intList.add(987);
		intList.add(333);
		
		System.out.println(intList);
		
//		System.out.println(intList.get(0));
//		System.out.println(intList.get(1));
//		System.out.println(intList.get(2));
//		System.out.println(intList.get(3));
//		System.out.println(intList.get(4));
//		System.out.println(intList.get(5));
//		System.out.println(intList.get(6));
		
		for(int a = 0; a < intList.size(); a++ ) {
			System.out.println(intList.get(a));
		}
	}
}
