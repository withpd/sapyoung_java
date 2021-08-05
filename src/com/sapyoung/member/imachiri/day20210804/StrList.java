package com.sapyoung.member.imachiri.day20210804;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();

		aList.add("안가은");
		aList.add("최혜원");
		aList.add("최원두");
		aList.add("박인화");
		int size = aList.size();
		System.out.println(size);
		
		boolean isContain = aList.contains("가나다");
		System.out.println(isContain);
		
		String myName = aList.get(0);
		System.out.println(myName);
		// 내 이름은 ArrayList에서 가장 먼저 나오는 것(0번)이므로 내 이름이 잘 뜸.
	
	}
}


//수정하고자 하는 단어의 최초지점을 클릭 -> 알트 시프트 알 -> 한번에 변경하기 가능해짐.