package com.sapyoung.member.peepstest.day20210722;

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

	public String getDepartName() {
			String depart = "µðÁöÅÐÆÀ";
			return depart; 
	}


	public String getMail() {
		String mail = "suzylee@sapyoung.com";
		return mail;
	}
	
	public int getFloor() {
	//	int floor = 5;
	//	return floor;
		return 5;
	}

	public void desc() {
		System.out.println("¾È³çÇÏ¼¼¿ä");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		
		return className;
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
