package com.sapyoung.member.withpd.day20210726;

import java.util.Iterator;

import com.sapyoung.member.allende8505.day20210722.Allende8505;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.smjhsh.day20210720.Smjhsh;

public class Withpd {

	// �������� / ��������
	String pos = "���";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	private String getPosition() {
		return pos;
//		return "����";
	}

	public String getName() {
		String name = "�輺ȣ";
		return name;
	}
	

	public int getFloor() {
//		int floor = 5;
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "��Ÿ";
		return depart;
	}
	
	public String getMail() {
		String mail = "withpd@gmail.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("�系 IT ������ �ð� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// ���α׷� ����
		Withpd w = new Withpd();
//		w.setPosition("����");
//		String posBefore = w.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		w.setPosition("����");
//		
//		String posAfter = w.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
		w.pos = "1111";
		String pos = w.getPosition();
		System.out.println(pos);
		
		// ���α׷� ����
	}
}





