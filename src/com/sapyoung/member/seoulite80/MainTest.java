package com.sapyoung.member.seoulite80;

import com.sapyoung.member.seoulite80.day20210802.Work;

public class MainTest {	
	public static void main(String[] args) {
		Work w = new Work();
		w.init("seoulite80");
		String result = w.getResult();
		System.out.println(result);
	}
}
