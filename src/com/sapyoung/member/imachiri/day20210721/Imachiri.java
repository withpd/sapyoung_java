package com.sapyoung.member.imachiri.day20210721;

import com.sapyoung.company.Company;
/*import com.sapyoung.hooni7777.day20210720.Hooni7777;*/

public class Imachiri {

	public String getName() {
		String name = "�Ȱ���";
		return name;
	}

	public String getPosition() {
		String pos = "�븮";
		return pos;
	}

	public void getFloor() {
		System.out.println("���� 1��");
	}
	
	public void getDepartname() {
		System.out.println("�����л����");
	}
	
	public void getMail() {
		System.out.println("gean716@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("�����л���� �Ż�� ��ȹ�� �����ϰ� �ֽ��ϴ�.");
	}

	public void getId() {
		System.out.println(getClass().getSimpleName());
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






