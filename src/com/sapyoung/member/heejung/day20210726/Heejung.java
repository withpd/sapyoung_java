package com.sapyoung.member.heejung.day20210726;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.company.Company;

public class Heejung {
	
	// �������� / ��������
	String pos = "���";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
//		return "����";
	}
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public int getFloor() {
		int floor = 3;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "�긯�� R&D";
		return depart;
	}
	
	public String getMail() {
		String mail = "eena@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("���� ������ �ð� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// ���α׷� ����
		Withpd w = new Withpd();
		
//		h.setPosition("����");
//		String posBefore = h.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		h.setPosition("����");
		
//		String posAfter = h.getPosition();
//		System.out.println("AFTER: " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		// ���α׷� ����
	}
	
	
}