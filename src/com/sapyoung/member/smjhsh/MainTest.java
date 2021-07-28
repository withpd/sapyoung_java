package com.sapyoung.member.smjhsh;

import com.sapyoung.member.smjhsh.day20210722.Smjhsh;

public class MainTest {	
	public static void main(String[] args) {
//			Smjhsh w = new Smjhsh();
//			String name = w.getName();          //return À¯
//			String pos = w.getPosition();  
//			w.getFloor();
//			
			
//			System.out.println("[" + pos + " " +name+"]");
//			w.desc();
//			
//			Company c = new Company();
//			c.getCompSite();
//			
//			Peepstest p = new Peepstest();
//			p.getDepartName();
			
			Smjhsh smjhsh = new Smjhsh();
			smjhsh.desc();
			String id = smjhsh.getId();
			
			id = "[" + id + "]" + 1111;
			
			System.out.println(id);
	}
}
