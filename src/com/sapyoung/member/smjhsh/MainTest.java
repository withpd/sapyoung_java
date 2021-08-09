package com.sapyoung.member.smjhsh;

import com.sapyoung.member.smjhsh.day20210802.Work;

public class MainTest {	
	public static void main(String[] args) {
		// Work (WorkAb,WorkIf)
		Work w = new Work();
		w.init("clara");
		w.process();
		String result = w.getResult();
		System.out.println(result);
	}
}
