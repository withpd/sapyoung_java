package com.sapyoung.member.allende8505.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.histoyw.day20210720.Histoyw;

public class Allende8505 {
	
	public String getName() {
		String name = "�ڵ���";
		return name;
	}
	
	public void getFloor() {
		System.out.println("2fl");
	}
	
	public void getDepartName() {
		System.out.println("��������");
	}
	
	public String getposition() {
		String pos = "�븮";
		return pos;
	}
	
	public void getMail() {
		System.out.println("dm8505@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("å �˴ϴ�");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main (String[] args) {
		Allende8505 a = new Allende8505();
		String name = a.getName();		//return ��
		String pos = a.getposition();	// return ��
		
		System.out.println(name + " " + pos);
		a.desc();
		
//		Company c = new Company();
//		c.getCompSite();
		
//		Histoyw h = new Histoyw();
//		h.getDepartName();
		
	}
}
