package com.sapyoung.member.histoyw.day20210722;

import com.sapyoung.company.Company;


public class Histoyw {
	
	public String getName() {
		String name = "�ۿ��";
		return name;
	}
	
	public String getPosition() {
		String pos = "������";
		return pos;
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "��̻����";
		return depart;
	}
		
	public String getMail() {
		String mail = "histoyw@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("�뼱�� �ø��� å�����Դϴ�");
	}
	
	public String getId() {
		String classname = getClass().getSimpleName();
		return classname;
	}
		
	public static void main(String[] args) {
		Histoyw h = new Histoyw();
		String name = h.getName();
		String pos = h.getPosition();
		
		System.out.println(pos + " " + name);
				
		
		
//		Company c = new Company();
//		c.getCompSite();
				
	}
		
}
