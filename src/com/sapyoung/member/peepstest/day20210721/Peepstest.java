package com.sapyoung.member.peepstest.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.member.imachiri.day20210720.Imachiri;

public class Peepstest {

	public String getName() {
		String name = "ÀÌ¼öÁö";
		return name;
	}
	
	public String getPosition() {
			String position = "»ç¿ø";
			return position;
	}

	public void getDepartName() {
		System.out.println("µðÁöÅÐÆÀ");

	}


	public void getMail() {
		System.out.println("suzylee@sapyoung.com");
	}
	
	public void getFloor() {
		System.out.println("5Ãþ");
	}

	public void desc() {
		System.out.println("¾È³çÇÏ¼¼¿ä");
	}

	public void getID() {
		System.out.println(getClass().getSimpleName());
	}
	
	
	public static void main(String[] args) {
		Peepstest w = new Peepstest();
		String name = w.getName();
		String position = w.getPosition();
		w.getFloor();
		
		System.out.println(name);
		System.out.println(position);
		System.out.println("[" + position + " " + name + "]");
		
		
		Company c = new Company ();
		c.getCompName();
		c.getCompTel();
		c.getCompSite();
		
		
		Imachiri i = new Imachiri();
		i.getDepartname();
		i.getPosition();
		
		
		
		
	}

}
