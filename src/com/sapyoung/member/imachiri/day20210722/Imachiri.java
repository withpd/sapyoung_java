package com.sapyoung.member.imachiri.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;

public class Imachiri {

	public String getName() {
		String name = "�Ȱ���";
		return name;
	}

	public String getPosition() {
		String pos = "�븮";
		return pos;
	}

	public int getFloor() {
	//	int floor = -1;
	//	return floor;
		return -1;
	}
	
	public String getDepartname() {
		String dep = "�����л����";
		return dep;
	}
	
	public String getMail() {
		String mail = "gean716@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("�����л���� �Ż�� ��ȹ�� �����ϰ� �ֽ��ϴ�.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		/* System.out.println(className); */
		return className;
	}
	
	public static void main(String[] args) {
		Imachiri i = new Imachiri();
		String name = i.getName();
		String pos = i.getPosition();
		
		System.out.println(name);
		System.out.println(pos);
		System.out.println(name + " " + pos);
		
		Company c = new Company();
		c.getCompName();
		c.getCompSite();
		c.getCompTel();
		
		
		
		/*
		 * Hooni7777 h = new Hooni7777(); h.getDepartName();
		 */		
	}
	
}






