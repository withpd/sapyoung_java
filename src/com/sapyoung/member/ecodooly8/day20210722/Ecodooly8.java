package com.sapyoung.member.ecodooly8.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.imachiri.day20210720.Imachiri;


public class Ecodooly8 {
	
	public String getName() {
		System.out.println("�������Դϴ�.");
		return "������";
	}

	public String getPosition() {

		return "����";
	}
	
	public void getDepartName() {
		System.out.println("�����л����");
	}
	
	public int getFloor() {
//		int floor = 1;
//		return floor;
		return 5;
	}
	public String getMail() {
		String mail = "onetwo12@ebricks.co.kr";
		return mail;
	}
	
	public void desc() {
		System.out.println("�����л���� ����Դϴ�");
	}
	

	public String getId() {
		System.out.println(getClass().getSimpleName());
		String className = getClass().getSimpleName();
		return className;
	}
	
	
	public static void main(String[] args ) {
		Ecodooly8 ecodooly8 = new Ecodooly8();
		String name = ecodooly8.getName();
		String pos = ecodooly8.getPosition();
		
		//System.out.println(name);
		System.out.println(pos);
		System.out.println(name + " " + pos);
		
		Company c = new Company();
		c.getCompSite();
		
		Imachiri i = new Imachiri();
		i.getDepartname();
		
	}
}
		