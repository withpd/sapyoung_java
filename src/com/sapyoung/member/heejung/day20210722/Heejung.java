package com.sapyoung.member.heejung.day20210722;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.company.Company;

public class Heejung {
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getPosition() {
//		String pos = "����";
//		return pos;
		return "����";
	}
	
	public int getFloor() {
		int floor = 3;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "�긯�� R&D";
		return depart;
	}
	
	public String getMail() {
		String mail = "eena@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("���� ������ �ð� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}
	
	public static void main(String[] args) {
		Heejung h = new Heejung();
		String name = h.getName();
		String pos = h.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		h.desc();
		
		Company c = new Company();
		c.getCompSite();
		
		Gerbugi g = new Gerbugi();
		g.getDepartName();
		
	}
}