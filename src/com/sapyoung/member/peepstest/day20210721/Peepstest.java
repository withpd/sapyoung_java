package com.sapyoung.member.peepstest.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.member.imachiri.day20210720.Imachiri;

public class Peepstest {

	public String getName() {
		String name = "�̼���";
		return name;
	}
	
	public String getPosition() {
			String position = "���";
			return position;
	}

	public void getDepartName() {
		System.out.println("��������");

	}


	public void getMail() {
		System.out.println("suzylee@sapyoung.com");
	}
	
	public void getFloor() {
		System.out.println("5��");
	}

	public void desc() {
		System.out.println("�ȳ��ϼ���");
	}

	public void getID() {
		System.out.println(getClass().getSimpleName());
	}
	
	
	public static void main(String[] args) {
		Peepstest w = new Peepstest();
		String name = w.getName();
		String position = w.getPosition();
		w.getFloor();
		
		System.out.println(name);
		System.out.println(position);
		System.out.println("[" + position + " " + name + "]");
		
		
		Company c = new Company ();
		c.getCompName();
		c.getCompTel();
		c.getCompSite();
		
		
		Imachiri i = new Imachiri();
		i.getDepartname();
		i.getPosition();
		
		
		
		
	}

}
