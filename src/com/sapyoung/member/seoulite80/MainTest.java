package com.sapyoung.member.seoulite80;

import com.sapyoung.member.seoulite80.day20210726.Seoulite80;

public class MainTest {
	
	public static void main(String[] args) {
		Seoulite80 s = new Seoulite80();

		String name = s.getName();
		String pos = s.getPosition();		
		System.out.println("[" + name + " " + pos + "]");
		s.desc();
		String id = s.getId();
		System.out.println(id);
	}
}
