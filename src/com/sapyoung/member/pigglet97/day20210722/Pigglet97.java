package com.sapyoung.member.pigglet97.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;

public class Pigglet97 {
	
	String pos;
		
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "�̽���";
		return name;
	}
	
	public String getDepartment() {
		String depart = "R&D";
		return depart;
	}
	
	public String getPosition() {
		String pos = "����";
		return pos;	
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

	public static void main(String[] arg12) {
		
		Pigglet97 pigglet97 = new Pigglet97();
		String pos = pigglet97.getPosition();
		System.out.println(pos);
		pigglet97.setPosition("����");
		String posBefore = pigglet97.getPosition();
		System.out.println("BEFORE:" + posBefore);
		pigglet97.setPosition("�븮");
		
		
		
				
		
		
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
