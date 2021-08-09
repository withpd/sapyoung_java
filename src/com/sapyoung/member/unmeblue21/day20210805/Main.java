package com.sapyoung.member.unmeblue21.day20210805;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();

		intList.add(317);	//0번째
		intList.add(21);	//1번째
		intList.add(072);
		intList.add(38);
		intList.add(4885);
		intList.add(04);
		intList.add(9);		//6번째
		
		System.out.println(intList);
		
		for(int i=0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}
}