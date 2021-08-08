package com.sapyoung.member.allende8505.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(89);
		intList.add(2341);
		intList.add(1939);
		intList.add(324);
		intList.add(67);
		
//		int  num = intList.get(3);
//		System.out.println(num);
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}
}
