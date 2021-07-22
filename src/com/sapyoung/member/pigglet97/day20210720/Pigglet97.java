package com.sapyoung.member.pigglet97.day20210720;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;

public class Pigglet97 {
	
	public String getName() {
		String name = "이승은";
		return name;
	}
	
	public void getDepartment() {
		System.out.println("Bricks R&D");	
	}
	
	public String getPosition() {
		String position = "부장";
		return position;	
	}
	
	public void getMail() {
		System.out.println("pigglet97@sapyoung.com");	
	}
	
	public void desc() {
	      System.out.println("교재개발을 담당하고 있습니다.");
	   }
	   
	public void getId() {
	      System.out.println(getClass().getSimpleName());
	   }
	
	public void getCompTel() {
		System.out.println("02-326-1182");
	}

	public static void main(String[] arg) {
		Pigglet97 p = new Pigglet97();
		String name = p.getName();
		String position = p.getPosition();
		
		System.out.println("[" + position + " " + name + "]");
		
		Company c = new Company ();
		c.getCompName(); 
		
	
	//	Hooni7777 h = new Hooni7777();
	//	h.getDepartName();
		}

	
}
