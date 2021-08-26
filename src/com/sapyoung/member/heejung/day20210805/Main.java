package com.sapyoung.member.heejung.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(10);
		intList.add(100);
		intList.add(1000);
		intList.add(466);
		intList.add(89);
		intList.add(399);
		
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
