package com.sapyoung.member.peepstest.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.imachiri.day20210720.Imachiri;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Peepstest {
	
	// �������� / ��������

	
	String pos;
	
	
	public void setPosition(String position) {
		pos = position; 
		System.out.println(position);
		
	}

	public String getName() {
		String name = "�̼���";
		return name;
	}
	
	public String getPosition() {
			String position = "���";
			return position;
	}

	public String getDepartName() {
			String depart = "��������";
			return depart; 
	}


	public String getMail() {
		String mail = "suzylee@sapyoung.com";
		return mail;
	}
	
	public int getFloor() {
	//	int floor = 5;
	//	return floor;
		return 5;
	}

	public void desc() {
		System.out.println("�ȳ��ϼ���");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		
		return className;
	}
	
	

	
	public static void main(String[] arg12) {
		// ���α׷� ���� 
		//Peepstest p = new Peepstest();
		
		Withpd w = new Withpd();

		//p.setPosition("�븮");
		//String posBefore = p.getPosition();
		//System.out.println("BEFORE : " + posBefore);
		//p.setPosition("Staff");
		//String posAfter = p.getPosition();
		//System.out.println("AFTER : " + posAfter);

		// ���α׷� ���� 
	}

}
