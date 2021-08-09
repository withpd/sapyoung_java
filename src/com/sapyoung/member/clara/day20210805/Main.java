package com.sapyoung.member.clara.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		intList.add(8050);    //0번째부터 시작
		intList.add(4725);
		intList.add(6363);
		intList.add(88);
		intList.add(777);
		intList.add(3);
		intList.add(880);
		intList.add(7);
		
		
//		int size = intList.size();   //리스트 개수
		
//		int num1 = intList.get(0);
//		int num2 = intList.get(1);
//		System.out.println(num1);  
//		System.out.println(num2);  
		
//		System.out.println(intList.get(num1));  
		
	
		
		for(int a = 0; a < intList.size(); a++ ) {
			System.out.println(intList.get(a));	
		}
		
		
		
	}
}
