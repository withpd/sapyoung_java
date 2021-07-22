package com.sapyoung.member.rtyou;

import com.sapyoung.member.rtyou.day20210722.Rtyou;

public class MainTest {
	
	public static void main(String[] arg) {
		
	//	Rtyou r = new Rtyou();
	//	r.getMail();
	//	r.getDepartName();
		
	Rtyou rtyou = new Rtyou();
	rtyou.desc();
	String id = rtyou.getId();
	
	id = "["+ id +"]" + 1234;
		System.out.println(id);
		
		
	
	}	
	
}
