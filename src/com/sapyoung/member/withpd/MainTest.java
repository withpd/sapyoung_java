package com.sapyoung.member.withpd;

import com.sapyoung.member.withpd.day20210721.Withpd;

public class MainTest {
	public static void main(String[] args) {
		
		Withpd w = new Withpd();
		String name = w.getName();
		String pos = w.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		w.desc();
		
	}
}

