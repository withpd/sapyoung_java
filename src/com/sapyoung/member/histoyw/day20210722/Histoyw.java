package com.sapyoung.member.histoyw.day20210722;

import com.sapyoung.company.Company;


public class Histoyw {
	
	public String getName() {
		String name = "송용운";
		return name;
	}
	
	public String getPosition() {
		String pos = "본부장";
		return pos;
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "어린이사업부";
		return depart;
	}
		
	public String getMail() {
		String mail = "histoyw@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("용선생 시리즈 책임자입니다");
	}
	
	public String getId() {
		String classname = getClass().getSimpleName();
		return classname;
	}
		
	public static void main(String[] args) {
		Histoyw h = new Histoyw();
		String name = h.getName();
		String pos = h.getPosition();
		
		System.out.println(pos + " " + name);
				
		
		
//		Company c = new Company();
//		c.getCompSite();
				
	}
		
}
