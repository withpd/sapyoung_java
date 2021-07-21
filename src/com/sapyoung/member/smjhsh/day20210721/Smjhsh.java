package com.sapyoung.member.smjhsh.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.peepstest.day20210720.Peepstest;

public class Smjhsh {
	public String getName() {
		String name = "È²¼ÒÈñ";
		return name;

	}

	public String getPosition() {
		String pos = "»ç¿ø";
		return pos;
		
	}
	
	public void getDepartName() {
		System.out.println("±¹¾îÆÀ");

	}


	public void getMail() {
		System.out.println("smj21@sapyoung.com");

	}
	
	public void getFloor() {
		System.out.println("2Ãþ");

	}

	public void desc() {
		System.out.println("±¹¾î ±³Àç¸¦ ¸¸µì´Ï´Ù.");

	}

	public void getId() {
		System.out.println(getClass().getSimpleName());

	}
		public static void main(String[] args) {
			Smjhsh w = new Smjhsh();
			String name = w.getName();          //return À¯
			String pos = w.getPosition();      
			
			System.out.println("[" + pos + " " +name+"]");
			w.desc();
			
//			Company c = new Company();
//			c.getCompSite();
//			
//			Peepstest p = new Peepstest();
//			p.getDepartName();
//			
		}
}
