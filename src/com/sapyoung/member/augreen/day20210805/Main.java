package com.sapyoung.member.augreen.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(5);        //0��°
		intList.add(55);       //1��°
		intList.add(555);      //2��°
		intList.add(5555);     //3��°
		intList.add(55555);    //4��°
		intList.add(555555);   //5��°
		
		int num = intList.get(3);
		
		System.out.println(num);
		
		for(int a = 0; a < intList.size(); a++) {
		
		System.out.println(intList.get(a));
		
		}
	}
}
