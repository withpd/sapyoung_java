package com.sapyoung.member.ysb0807.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.yhjae1004.day20210720.Yhjae1004;

public class Ysb0807 {
	
	public String getName() {
		String name = "������";
		return name;
	}

	public String getDepartName() {
		String depart = "�긯���˾ص�";
		return depart;
	}
	
	public int getFloor() {
		// int floor = 3; 
		// return floor;
		return 5;
	}
	
	public String getPosition () {
		String pos = "���";
		return pos;
	}
	
	public String getMail () {
		String mail = "ysb0807@sapyoung.com";
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
		Ysb0807 y = new Ysb0807();
		String name = y.getName();
		String pos = y.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		y.desc();
		
		Company c = new Company();
		c.getCompSite();
		
		Yhjae1004 w = new Yhjae1004();
		w.getDepartName();
		
	}
	
}
