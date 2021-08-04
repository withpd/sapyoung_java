package com.sapyoung.member.pigglet97.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(100);
		intList.add(10000);
		intList.add(1000000);
		
		int size = intList.size();
		System.out.println(size);
		
		boolean isContain = intList.contains(2);
	//	System.out.println(isContain);
		
	//	if(isContain != true) {           //true일때 =true 생략 가능, false일때 !isContain
	//		System.out.println(false);
	//	} else {
	//		System.out.println(true);
			
	//	}
		
		int num1 = intList.get(2);
		System.out.println(num1);
		
		
	}

}
