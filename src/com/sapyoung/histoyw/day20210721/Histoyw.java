package com.sapyoung.histoyw.day20210721;

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
	
	public void getDepartName() {
		System.out.println("어린이사업부");
	}
		
	public void getMail() {
		System.out.println("histoyw@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("용선생 시리즈 책임자입니다");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
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
