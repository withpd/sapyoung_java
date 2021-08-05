package com.sapyoung.member.imachiri.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>(); 
		intList.add(1);
		intList.add(-1);
		intList.add(3);
		intList.add(15);
		intList.add(70);

//		int num = intList.get(1);
//		System.out.println(num);
		//get(번호)는 몇 번째 값을 가져올지를 나타내는 내용. 마찬가지로 자바에서 0이 첫 번째이므로 1는 2번쨰이다. 
		//위의 두 줄을 줄여서 System.out.println(intList.get(1)); 라고 해도 된다.
		
		// 시작점은 첫 번째 항목(a값은 0), a는 전체 리스트에 있는 항목 수(size)보다 작다. a값은 1씩 커진다(++)
		for(int a = 0; a < intList.size(); a++) {
			System.out.println(intList.get(a));
		}
		
		
	}
}

 