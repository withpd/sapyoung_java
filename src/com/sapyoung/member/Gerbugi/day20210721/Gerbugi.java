package com.sapyoung.member.Gerbugi.day20210721;

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
	
	public void getDepartName() {
		System.out.println("�濵��������");
	}
	
	public void getMail() {
		System.out.println("nagobugi@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("������ �Ѱ��ϰ� �ֽ��ϴ�.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
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
