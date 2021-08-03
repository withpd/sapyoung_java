package com.sapyoung.member.allende8505;

import com.sapyoung.member.allende8505.day20210802.Work;

public class MainTest {
	public static void main(String[] arg) {
		Work w = new Work();
		w.init("allende8505");
		String result = w.getResult();
		System.out.println(result);
	}
}
