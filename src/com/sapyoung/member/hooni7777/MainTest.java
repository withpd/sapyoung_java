package com.sapyoung.member.hooni7777;

import com.sapyoung.member.hooni7777.day20210802.Work;

public class MainTest {
	public static void main(String[] arg) {
		Work w = new Work();
		w.init("cswmil");
		w.process();
		String result = w.getResult();
		
		System.out.println(result);
	}
}

