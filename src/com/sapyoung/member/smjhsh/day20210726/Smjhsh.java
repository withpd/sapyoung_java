package com.sapyoung.member.smjhsh.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Smjhsh {
//	�������� / ��������
	private String pos;   //����      
	private String mail;
	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	private String id;
	private String floor;
	private String departName;
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
//		return "���";
		
	}
	
	public String getName() {
		String name = "Ȳ����";
		return name;

	}

	public String getDepartName() {
		String depart = "������";
		return depart;

	}


	public String getMail() {
		String mail = "smj21@sapyoung.com";
		return mail;

	}

	public int getFloor() {
		int floor = 2;
		return floor;

	}

	public void desc() {
		System.out.println("���� ���縦 ����ϴ�.");

	}

	public String getId() {
		String className = (getClass().getSimpleName());
		System.out.println(className);
		
		return className;

	}

	public static void main(String[] arg12) {
//		Smjhsh w = new Smjhsh();
		
//		���α׷� ����
		Withpd w = new Withpd();
//		w.setPosition("��_��");
//		String posBefore = w.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		w.setPosition("���");
//		String posAfter = w.getPosition();
//		System.out.println("AFTER : " + posAfter);
//		���α׷� ����
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
	}

	
}

