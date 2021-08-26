package com.sapyoung.crawl.cswmil;

import com.sapyoung.member.cswmil.day20210802.Work;

public class MainTest {
	public static void main(String[] args) {
		// Work ( WorkAB, WorkIf)
		Work w = new Work();
		w.init("allendel8505"); // id ¼³Á¤
		String result = w.getResult();
		System.out.println(result);
				
	}
}

