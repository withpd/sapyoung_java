package com.sapyoung.member.pigglet97.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Pigglet97 {
	
	String pos;
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "이승은";
		return name;
	}
	
	public String getDepartment() {
		String depart = "R&D";
		return depart;
	}
	
	public String getPosition() {
		String position = "부장";
		return position;	
	}
	
	public int getFloor() {
//		int floor = 3;
//		return floor;
		return 3;
	}
	
	public String getMail() {
		String mail = "pigglet97@sapyoung.com";
		return mail;	
	}
	
	public String desc() {
	    String des = "교재개발을 담당하고 있습니다.";
		return des;
	   }
	   
	public String getId() {	
		  String className = getClass().getSimpleName();
	// System.out.println(className);
		  return className;
	   }
	
	public String getCompTel() {
		String comtel = "02-326-1182";
		return comtel;
		
	}

			
		public static void main(String[] arg12) {
			
			Withpd w = new Withpd();
			
		//	Pigglet97 pigglet97 = new Pigglet97();
			
		//	String pos = pigglet97.getPosition();
		//  System.out.println(pos);
		//  pigglet97.setPosition("부장");
		//  String posBefore = pigglet97.getPosition();
		//  System.out.println("BEFORE:" + posBefore);
		//  pigglet97.setPosition("대리");
			
			
			
			// w.pos = "1111";
			// String pos = w.getPosition();
			// System.out.println(pos);		
			
			
			//Pigglet97 p = new Pigglet97();
			//String name = p.getName();
			//String position = p.getPosition();
			
			//System.out.println("[" + position + " " + name + "]");
			
			//Company c = new Company ();
			//c.getCompName(); 
			
		
		//	Hooni7777 h = new Hooni7777();
		//	h.getDepartName();
			}

		
}
