package com.sapyoung.member.withpd;

import com.sapyoung.member.withpd.day20210722.Withpd;

public class MainTest {
	public static void main(String[] args) {
		
//		Withpd w = new Withpd();
//		w.getName();
//		String pos = w.getPosition();
//		w.getFloor();
//		
//		System.out.println("[" + pos + " " + name + "]");
//		w.desc();
		
		Withpd withpd = new Withpd();
		withpd.desc();
		String id = withpd.getId();
		
		id = "[" + id + "]" + 1111;
		
		System.out.println(id);
	}
}

