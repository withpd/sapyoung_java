package com.sapyoung.member.heejung.day20210722;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.company.Company;

public class Heejung {
	
	public String getName() {
		String name = "장희정";
		return name;
	}
	
	public String getPosition() {
//		String pos = "차장";
//		return pos;
		return "차장";
	}
	
	public int getFloor() {
		int floor = 3;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "브릭스 R&D";
		return depart;
	}
	
	public String getMail() {
		String mail = "eena@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("교재 개발을 맡고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}
	
	public static void main(String[] args) {
		Heejung h = new Heejung();
		String name = h.getName();
		String pos = h.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		h.desc();
		
		Company c = new Company();
		c.getCompSite();
		
		Gerbugi g = new Gerbugi();
		g.getDepartName();
		
	}
}