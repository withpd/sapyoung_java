package com.sapyoung.member.clara.day20210722;

import com.sapyoung.member.Gerbugi.day20210722.Gerbugi;

public class Clara {
	public String getName() {
		String name = "이애숙";
		return name;
	}
	
	public String getPosition() {
//		String pos = "대표";
//		return pos;
		return "대표";
	}

	public int getFloor() {
//		int floor = 3;
//		return floor;
		return 3;
	}
	
	public String getDepartName() {
		String depart = "bricks";
		return depart;
	}
	
	public String getMail() {
		String mail = "las@ebricks.co.kr";
		return mail;
	}
	
	public void desc() {
		String desc = "R&D";
		System.out.println(desc);
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		Gerbugi g = new Gerbugi();
		String name = g.getName();
		String pos = g.getPosition();
		
		
		
		System.out.println("[" + pos + " " + name + "]");
		
//		Company c = new Company();
//		c.getCompName();
		
//		Hooni7777 h = new Hooni7777();
//		h.getDepartName();	
	}
}
