package com.sapyoung.member.augreen;

import com.sapyoung.member.augreen.day20210722.Augreen;

public class MainTest {
	
		public static void main(String[] arg) {
					
					
			
			
		Augreen a = new Augreen();
		String name = a.getName();
		String pos = a.getPosition();
		System.out.println("[" + name + " " + pos + "]");
		a.desc();
		String id = a.getId();
		
		id = "[" + id + "]";
		
		System.out.println(id);
		
		
	}
	
	
	
	
	
}
