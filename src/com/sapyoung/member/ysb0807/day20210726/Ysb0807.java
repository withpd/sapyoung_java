package com.sapyoung.member.ysb0807.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Ysb0807 {
	
	// �������� / ��������
	String pos = "���";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "������";
		return name;
	}

	public String getDepartName() {
		String depart = "�긯���˾ص�";
		return depart;
	}
	
	public int getFloor() {
		// int floor = 3; 
		// return floor;
		return 5;
	}
	
	public String getPosition () {
		return pos;
		// return "����";
	}
	
	public String getMail () {
		String mail = "ysb0807@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("���� ������ �ð� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		
		return className;
	}
	
	public static void main(String[] arg12) {
		// ���α׷� ����
		Withpd w = new Withpd();
		
		// y.setPosition("����");
		// String posBefore = y.getPosition();
		// System.out.println("BEFORE : " + posBefore);
		
		// y.setPosition("�븮");
		
		// String posAfter = y.getPosition();
		// System.out.println("AFTER : " + posAfter);
		
		//w.pos = "1111";
		//String pos = w.getPosition();
		//System.out.println(pos);
		
		// ���α׷� ����
	}
	
}
