package com.sapyoung.member.cswmil.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Cswmil {
	
	// �������� / ��������
	String pos = "���";
	
	public void setPosition(String position) {
		pos = position;
		
	}

	public String getName() {
		String name = "õ����";
		return name;
	}
	
	public String getPosition() {
		return pos;
//		return "����";
	}

	public int getFloor() {
		int floor = -1;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "�긯�� �����ú���";
		return depart;
	}
	
	public String getMail() {
		String mail = "cswmil@ebricks.co.kr";
		return mail;
	}
	
	public void desc() {
		System.out.println("���� �������� �ð� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// ���α׷� ����
		Withpd w = new Withpd();
		
//		c.setPosition("����");
//		String posBefore = c.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		c.setPosition("����");
		
				
//		String posAfter = c.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		// ���α׷� ����
	}
	
	
}
