package com.sapyoung.member.seravision3.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(111);
		intList.add(2222);
		intList.add(33);
		intList.add(444);
		intList.add(555);
		intList.add(66666);
		
		int num = intList.get(3);
		System.out.println(num);
		
//		System.out.println(intList.get(0));
		
		
			
		for(int a = 0; a < intList.size(); a++ ) {
		System.out.println(intList.get(a));
			}	
		
	}

}
