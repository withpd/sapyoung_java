package com.sapyoung.member.unmeblue21.day20210721;

import com.sapyoung.allende8505.day20210720.Allende8505;
import com.sapyoung.company.Company;

public class Unmeblue21 {

	public String getName() {
		String name = "���ϱ�";
		return name;
	}

	public String getPosition() {
		String position = "����";
		return position;
	}

	public void getFloor() {
		System.out.println("4��");
	}
		
	private void getDepartName() {
		System.out.println("�Ż��3��");
	}

	public void getMail() {
		System.out.println("with@sapyoung.com");
	}

	public void desc() {
		System.out.println("�Ż�� ����");
	}

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Unmeblue21 un = new Unmeblue21();
		String name = un.getName();
		String position = un.getPosition();
		
		System.out.println("[" + position + " " + name + "]");
		
		Company co = new Company();
		co.getCompName();
		co.getCompTel();

		Allende8505 al = new Allende8505();
		al.getDepartName();
		
		
	}
	
}
