package com.sapyoung.member.ecodooly8.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.imachiri.day20210720.Imachiri;

public class Ecodooly8 {
	
	public String getName() {
		String name = "±èÁö¹Î";
		return name;
	}

	public String getPosition() {
		String pos = "Á÷¿ø";
		return "Á÷¿ø";
	}
	
	public void getDepartName() {
		System.out.println("µðÁöÅÐ»ç¾÷ÆÀ");
	}
	
	public void getMail() {
		System.out.println("onetwo12@ebricks.co.kr");
	}
	
	public void desc() {
		System.out.println("µðÁöÅÐ»ç¾÷ÆÀ ´ã´çÀÔ´Ï´Ù");
	}
	

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args ) {
		Ecodooly8 e = new Ecodooly8();
		String name = e.getName();
		String pos = e.getPosition();
		
		System.out.println(name);
		System.out.println(pos);
		System.out.println(name + " " + pos);
		
		Company c = new Company();
		c.getCompSite();
		
		Imachiri i = new Imachiri();
		i.getDepartname();
		
	}
}
		