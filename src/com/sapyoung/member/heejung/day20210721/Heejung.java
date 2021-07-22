package com.sapyoung.member.heejung.day20210721;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.company.Company;

public class Heejung {
	
	public String getName() {
		String name = "장희정";
		return name;
	}
	
	public void getFloor() {
		System.out.println("3층");
	}
	
	public void getDepartName() {
		System.out.println("브릭스 R&D");
	}
	
	public String getPosition() {
		String pos = "차장";
		return pos;
	}
	
	public void getMail() {
		System.out.println("eena@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("교재 개발을 맡고 있습니다.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
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