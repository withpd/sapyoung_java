package com.sapyoung.member.yhjae1004.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(92);	//0��°
		intList.add(11);	//1��°
		intList.add(8);		//2��°
		intList.add(1004);
		intList.add(2021);
		intList.add(805);	//5��°
		
//		System.out.println(intList);
//		System.out.println(intList.get(3));
		
		for(int a = 0; a < intList.size(); a++) {
			System.out.println(intList.get(a));
		}
	}
}
