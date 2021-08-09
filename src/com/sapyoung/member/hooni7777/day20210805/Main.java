package com.sapyoung.member.hooni7777.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(8);
		intList.add(4444);
		intList.add(555);
		intList.add(100);
		intList.add(1000);
		intList.add(99999);
		
//		System.out.println(intList.get(1));
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
			
		}
		
	}
}
