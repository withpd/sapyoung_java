package com.sapyoung.member.rtyou.day20210721;

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
	
	
	public void getFloor() {
		System.out.println("2��");

	}
	
	public void getDepartName() {
		System.out.println("������");

	}


	public void getMail() {
		System.out.println("rosa@sapyoung.com");

	}

	public void desc() {
		System.out.println("���� ���縦 ����ϴ�.");

	}

	public void getId() {
		System.out.println(getClass().getSimpleName());

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
