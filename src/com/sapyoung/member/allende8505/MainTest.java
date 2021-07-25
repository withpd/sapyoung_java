package com.sapyoung.member.allende8505;

import com.sapyoung.member.allende8505.day20210722.Allende8505;

public class MainTest {
	
	public static void main(String[] arg) {		
		Allende8505 a = new Allende8505();
		String name = a.getName();
		String id = a.getId();
		int floor = a.getFloor();
		String depart = a.getDepartName();
		String pos = a.getposition();
		String mail = a.getMail();
		
		id = "[" + id + "]";
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(floor+"Ãþ");
		System.out.println(depart);
		System.out.println(pos);
		System.out.println(mail);
		a.desc();
	}
}
