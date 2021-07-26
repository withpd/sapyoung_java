package com.sapyoung.member.heejung;

import com.sapyoung.member.heejung.day20210722.Heejung;

public class MainTest {
	
	String s = "d";
	
	public static void main(String[] arg) {
		
//		Heejung h = new Heejung();
//		String name = h.getName();
//		String pos = h.getPosition();
		
		
//		h.getMail();
//		h.getCompName();
//		h.getDepartName();
		
//		Gerbugi g = new Gerbugi();
//		g.getName();
//		g.getId();
		
		
		Heejung heejung = new Heejung();
		heejung.desc();
		String id = heejung.getId();
		
		id = "[" + id + "]" + 1111;
		
		System.out.println(id);
	}
}
