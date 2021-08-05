package com.sapyoung.member.pigglet97.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(5);
		intList.add(8);
		intList.add(100);
		intList.add(7856);
		intList.add(9583);
		intList.add(8888);
		
		int num = intList.get(3);
	//	System.out.println(num);
		
		for(int a = 0 ; a < intList.size(); a++) {
			System.out.println(intList.get(a));
		}
	}
}
