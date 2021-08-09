package com.sapyoung.member.Gerbugi.day20210805;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();  
		
		intList.add(100);
		intList.add(202);
		intList.add(1009);
		
//		int num1 = intList.get(0);
//		System.out.println(num1);
//		System.out.println(intList.get(0));
	
		for(int a=0; a < intList.size(); a++) {
			System.out.println(intList.get(a));
		}
		
		}
}
