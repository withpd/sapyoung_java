package com.sapyoung.member.rtyou.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.peepstest.day20210720.Peepstest;

public class Rtyou {
	public String getName() {
		String name = "�ִٿ�";
		return name;
	}

	public String getPosition() {	
		String pos = "����";
		return pos;
		
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
		
	}
	
	
	public String getDepartName() {
		String depart ="������";
		return depart;

	}


	public String getMail() {
		String mail ="rosa@sapyoung.com";
		return mail;

	}

	public void desc() {
		System.out.println("���� ���縦 ����ϴ�.");

	}
	


	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;

	}

	public static void main(String[] args) {
		Rtyou r = new Rtyou();
		String name = r.getName(); 
		String pos = r.getPosition(); 
		
	
		System.out.println("[" + pos + " " + name + "]");
		r.desc();
		
	
		
		Company c = new Company();
		c.getCompSite(); 
		
		Peepstest p = new Peepstest();
		p.getMail();
		
		
	
	}

}
