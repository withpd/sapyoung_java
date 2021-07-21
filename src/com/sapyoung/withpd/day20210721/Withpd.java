package com.sapyoung.withpd.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.pigglet97.day20210720.Pigglet97;

public class Withpd {

	public String getName() {
		String name = "배성호";
		return name;
	}
	
	public String getPosition() {
//		String pos = "강사";
//		return pos;
		return "강사";
	}

	public void getFloor() {
		System.out.println("5층");
	}
	
	public void getDepartName() {
		System.out.println("기타");
	}
	
	
	public void getMail() {
		System.out.println("withpd@gmail.com");
	}
	
	public void desc() {
		System.out.println("사내 IT 교육을 맡고 있습니다.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Withpd w = new Withpd();
		String name = w.getName();			// return 유
		String pos = w.getPosition();		// return 무
		
		System.out.println("[" + pos + " " + name + "]");
		w.desc();
		
//		Company c = new Company();
//		c.getCompSite();
//		
//		Pigglet97 p = new Pigglet97();
//		p.getDepartment();
		
		
	}
}
