package com.sapyoung.member.augreen.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.histoyw.day20210720.Histoyw;

public class Augreen {
	
	public String getName() {
		String name = "고하영";		
		return name;
	}

	
	public String getDepartName() {
		String depart = "아카데미";
		return depart;
	}

	public int getFloor() {
//		int floor = 4;
//		return floor;
		return 5;
	}
	
	public String getPosition() {
		String pos = "대표";
		return pos;
	}
	
	public String getMail() {
		String mail = "kohayoung@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("아카데미 운영");
	}

	public String getId() {
		String className = getClass().getSimpleName();		
		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		Augreen a = new Augreen();
		String name = a.getName();		
		String pos = a.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		a.desc();
		
		
//		Company c = new Company();
//		c.getCompSite();
		
//		Histoyw h = new Histoyw();
//		h.getDepartName();
	}
}