package com.sapyoung.member.rtyou.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
	
		intList.add(10); //0번째
		intList.add(200); //1번째
		intList.add(3000);
		intList.add(40000);
		intList.add(500000);
		
		// int size = intList.size(); 줄 세우는 게 몇갠지 
		// System.out.println(intList);  줄세우는 게 어떤 요소인지 
		
//		int num = intList.get(0); 
//		위 없어도 됨. 하단 intList.get은 위를 치환한 것. 
//		System.out.println(intList.get(0));
//		줄 세운 요소의 몇 번째가 어떤 요소인지 
		
		//각각의 요소를 출력하는 방법도 있지만 비효율적임.  반복문 이용해서 라인 수 줄임
		for(int a = 0; a < intList.size(); a++) {
		System.out.println(intList.get(a));	
		}
			//1번 반목은 사이즈만큼 넘치면 에러, a++는 a에 1씩 더하는거 
		
	}
	
}
