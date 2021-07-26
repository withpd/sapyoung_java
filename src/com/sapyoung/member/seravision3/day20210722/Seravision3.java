package com.sapyoung.member.seravision3.day20210722;

import com.sapyoung.member.allende8505.day20210720.Allende8505;
import com.sapyoung.company.Company;

public class Seravision3 {

	public String getName() {
		String name = "김세라";
		return name;
	}
		
	public String getPosition() {
//		String pos = "강사";
//		return pos;
		return "강사";
	}
	
	public int getFloor() {
//		int floor = 2;
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "마케팅팀";
		return depart;
	}

	public String getMail() {
		String mail="seravision@gmail.com";
		return mail;
	}

	public static void desc() {
		System.out.println("사내 IT 교육을 맡고 있습니다.");
	}

	public String getId() {
		String className = getClass().getSimpleName(); 
//		System.out.println(className);
		return className;
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
