package com.sapyoung.member.seoulite80.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(10);
		intList.add(50);
		intList.add(100);
		intList.add(333);
		intList.add(555);
		intList.add(2187);
		
		for (int i = 0; i < intList.size(); i++) {
			int num = intList.get(i);
			System.out.println(num);			
		}
	}
}
