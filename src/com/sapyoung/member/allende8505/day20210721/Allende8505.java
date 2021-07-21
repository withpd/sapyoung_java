package com.sapyoung.member.allende8505.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.histoyw.day20210720.Histoyw;

public class Allende8505 {
	
	public String getName() {
		String name = "박동명";
		return name;
	}
	
	public void getFloor() {
		System.out.println("2fl");
	}
	
	public void getDepartName() {
		System.out.println("사평마케팅");
	}
	
	public String getposition() {
		String pos = "대리";
		return pos;
	}
	
	public void getMail() {
		System.out.println("dm8505@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("책 팝니다");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main (String[] args) {
		Allende8505 a = new Allende8505();
		String name = a.getName();		//return 유
		String pos = a.getposition();	// return 무
		
		System.out.println(name + " " + pos);
		a.desc();
		
//		Company c = new Company();
//		c.getCompSite();
		
//		Histoyw h = new Histoyw();
//		h.getDepartName();
		
	}
}
