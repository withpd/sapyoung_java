package com.sapyoung.member.Gerbugi.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;

public class Gerbugi {
	
	public String getName() {
		String name = "������";
		return name;
 
	}
	
	public String getPosition() {
		String pos = "�̻�";
		return pos;
	}
	
	public int getFloor() {
//		int floor = "5";
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "�濵��������";
		return depart;
	}
	
	public String getMail() {
		String mail = "nagobugi@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		String desc = "������ �Ѱ��ϰ� �ֽ��ϴ�.";
		System.out.println(desc);
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		Gerbugi g = new Gerbugi();
		String name = g.getName();
		String pos = g.getPosition();
		
		
		
		System.out.println("[" + pos + " " + name + "]");
		
//		Company c = new Company();
//		c.getCompName();
		
//		Hooni7777 h = new Hooni7777();
//		h.getDepartName();
	}
}
