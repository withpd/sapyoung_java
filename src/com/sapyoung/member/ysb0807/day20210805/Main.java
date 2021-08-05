package com.sapyoung.member.ysb0807.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(100);
		intList.add(1000);
		intList.add(3000);
		intList.add(6000);
		intList.add(9999);
				
		for(int a = 0; a < intList.size(); a++ ) {
		System.out.println(intList.get(a));
		}
	}
}
