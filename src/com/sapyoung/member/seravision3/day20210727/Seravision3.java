package com.sapyoung.member.seravision3.day20210727;

import com.sapyoung.member.allende8505.day20210720.Allende8505;
import com.sapyoung.company.Company;

public class Seravision3 {
	
	String pos;
	
	public void setPosition(String position) {
		 pos=position;
	}

	public String getPosition() {
		
		return pos;
//		return "°­»ç";
	}
	
	public String getName() {
		String name = "±è¼¼¶ó";
		return name;
	}
		
	
	public int getFloor() {
//		int floor = 2;
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "¸¶ÄÉÆÃÆÀ";
		return depart;
	}

	public String getMail() {
		String mail="seravision@gmail.com";
		return mail;
	}

	public static void desc() {
		System.out.println("»ç³» IT ±³À°À» ¸Ã°í ÀÖ½À´Ï´Ù.");
	}

	public String getId() {
		String className = getClass().getSimpleName(); 
//		System.out.println(className);
		return className;
	}
	
	
	public static void main(String[] arg12) {
		Seravision3 s = new Seravision3();
		String val = s.getName();
	}

//	public static void main(String[] args) {
//		Seravision3 w = new Seravision3();
//        String name = w.getName();
//        String pos = w.getPosition();
//        
//        System.out.println("["+ pos +" "+name +"]");
//        
//        Company c = new Company();
//        c.getCompSite();	
//        
//        Allende8505 s = new Allende8505();
//        s.getDepartName();
//	}
    
       
     	
}
