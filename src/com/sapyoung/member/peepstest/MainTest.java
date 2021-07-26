package com.sapyoung.member.peepstest;

import com.sapyoung.member.peepstest.day20210722.Peepstest;

public class MainTest {

	public static void main(String[] arg) {
		//Peepstest w = new Peepstest();
		//w.getMail();
		//w.getCompName();
		//w.getDepartName();
		
		Peepstest p = new Peepstest();
		p.desc();
		p.getMail();
		String mail = p.getMail();
		System.out.println(mail);
		String id = p.getId();
		System.out.println(id);
		
		id = "[" + id + "]";
	}

}
