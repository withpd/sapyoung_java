package com.sapyoung.member.smjhsh.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);  //0��°
		intList.add(7);  //1��°
		intList.add(8282);  //2��°
		intList.add(555);
		intList.add(1021);
		intList.add(9876);
		intList.add(256);
		
//		int num = intList.get(3);
//
//		System.out.println(intList.get(0));
//		System.out.println(intList.get(1));
//		System.out.println(intList.get(2));
//		System.out.println(intList.get(3));
//		System.out.println(intList.get(4));
//		System.out.println(intList.get(5));
//		System.out.println(intList.get(6));

		//a++�� a�� 1�� ������Ų�ٴ� ��.
		for(int a = 0; a < intList.size(); a++) {
			System.out.println(intList.get(a));
			
		}
		
	}

}
