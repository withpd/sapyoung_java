package com.sapyoung.member.yhjae1004;

import com.sapyoung.member.yhjae1004.day20210722.Yhjae1004;

public class MainTest {
	
	public static void main(String[] arg) {
//		Yhjae1004 yhj = new Yhjae1004();
//		yhj.getMail();
//		yhj.getCompName();
//		yhj.getDepartName();
		
//		System.out.println("[" + pos + " " + name + "]");
//		w.desc();
		
		Yhjae1004 y = new Yhjae1004();
		y.desc();
		String id = y.getId();
		
		id = "[" + id + "]";
		
		System.out.println(id);
	}
}