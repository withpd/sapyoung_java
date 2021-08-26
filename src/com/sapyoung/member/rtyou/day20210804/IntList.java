package com.sapyoung.member.rtyou.day20210804;

import java.util.ArrayList;

public class IntList {
	public static void main(String[] args) {
	ArrayList<Integer> intList = new ArrayList<>();
	
	intList.add(1);
	intList.add(2);
	intList.add(100);
	intList.add(1000);
	intList.add(10000);
	
	int size = intList.size();
	//System.out.println(size);
	
	boolean isContain = intList.contains(1);
//	System.out.println(isContain);
	
	int num1 = intList.get(2);
	System.out.println(num1);
	
	if(isContain == true) {
		System.out.println(false);
	} else {
		System.out.println(true);
		
	}
		
	}
	
	
	// == 같다   != 아니다 
	// if(isContain == true) --> if(isContatin) 
	// id(isContain !=true) --> if(!isContatin)
}
