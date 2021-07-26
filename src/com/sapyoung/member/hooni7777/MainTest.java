package com.sapyoung.member.hooni7777;

import com.sapyoung.member.hooni7777.day20210722.Hooni7777;

public class MainTest {
		
	public static void main(String[] arg) {
//		Hooni7777 h = new Hooni7777();
//		h.getName();
//		h.getMail();
//		h.getCompTel();
//		h.getId();
		
		
		Hooni7777 hooni7777 = new Hooni7777();
		hooni7777.desc();
		String id = hooni7777.getId();
		
		id = "[" + id + "]" + 1111;
		
		System.out.println(id);
		
	}
}
