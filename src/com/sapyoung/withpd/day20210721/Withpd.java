package com.sapyoung.withpd.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.pigglet97.day20210720.Pigglet97;

public class Withpd {

	public String getName() {
		String name = "�輺ȣ";
		return name;
	}
	
	public String getPosition() {
//		String pos = "����";
//		return pos;
		return "����";
	}

	public void getFloor() {
		System.out.println("5��");
	}
	
	public void getDepartName() {
		System.out.println("��Ÿ");
	}
	
	
	public void getMail() {
		System.out.println("withpd@gmail.com");
	}
	
	public void desc() {
		System.out.println("�系 IT ������ �ð� �ֽ��ϴ�.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Withpd w = new Withpd();
		String name = w.getName();			// return ��
		String pos = w.getPosition();		// return ��
		
		System.out.println("[" + pos + " " + name + "]");
		w.desc();
		
//		Company c = new Company();
//		c.getCompSite();
//		
//		Pigglet97 p = new Pigglet97();
//		p.getDepartment();
		
		
	}
}
