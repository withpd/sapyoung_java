package com.sapyoung.member.clara.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.member.heejung.day20210720.Heejung;


public class Clara {

	public String getName() {
		String name = "ÀÌ¾Ö¼÷";
		return name;
	}
	

	
	public String getPosition() {
//		String pos = "´ëÇ¥";
//		return pos;
		return "´ëÇ¥";
	}
	
	public void getFloor() {
		System.out.println("3Ãþ");
	}
	
	public void getDepartName() {
		System.out.println("bricks");
	}
	
	public void getMail() {
		System.out.println("las@ebricks.co.kr");
	}
	
	public void desc() {
		System.out.println("R&D");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Clara c = new Clara();
		String name = c.getName();			// return À¯
		String pos = c.getPosition();		// return ¹«
		
		System.out.println("[" + pos + " " + name + "]");
		c.desc();
		
//		Company o = new Company();
//		o.getCompSite();
//	
//		Heejung h = new Heejung();
//		h.getDepartName();
		
	}
}
