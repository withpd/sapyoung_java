package com.sapyoung.member.pigglet97.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;

public class Pigglet97 {
	
	public String getName() {
		String name = "�̽���";
		return name;
	}
	
	public String getDepartment() {
		String depart = "R&D";
		return depart;
	}
	
	public String getPosition() {
		String position = "����";
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
	    String des = "���簳���� ����ϰ� �ֽ��ϴ�.";
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

	public static void main(String[] arg) {
		
		Pigglet97 pigglet97 = new Pigglet97();
		pigglet97.desc();
		String id = pigglet97.getId();
		String comtel = pigglet97.getCompTel();
		System.out.println(id);
		
		id = "["  + id  +  "]" + 1111;
			
		System.out.println(id);
		System.out.println(comtel);
		
		
				
		
		
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
