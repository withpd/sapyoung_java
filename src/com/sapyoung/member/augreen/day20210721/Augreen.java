package com.sapyoung.member.augreen.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.member.histoyw.day20210720.Histoyw;

public class Augreen {
	public String getName() {
		String name = "���Ͽ�";		
		return name;
	}

	
	public void getDepartName() {
		System.out.println("��ī����");
	}

	public void getFloor() {
		System.out.println("4��");
	}
	
	public String getPosition() {
		String pos = "��ǥ";
		return pos;
	}
	
	public void getMail() {
		System.out.println("kohayoung@sapyoung.com");
	}

	public void desc() {
		System.out.println("��ī���� �");
	}

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Augreen a = new Augreen();
		String name = a.getName();		
		String pos = a.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		a.desc();
		
		
//		Company c = new Company();
//		c.getCompSite();
		
//		Histoyw h = new Histoyw();
//		h.getDepartName();
	}
}