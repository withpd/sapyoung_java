package com.sapyoung.member.yhjae1004.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Yhjae1004 {
	
	//�������� / ��������
	String pos = "���"; //pos������ setPosition�� getPosition�� �̾��ִ� �Ű�ü
		
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getDepartName() {
		String depart = "���";
		return depart;
	}
	
	public String getPosition() {
		return pos; 
		//return "���";
	}
	
	public int getFloor() {
		// int floor = 3;
		// return floor;
		return 5;
	}
	
	public String getMail() {
		String mail = "yhjae92@ebrick.co.kr";
		return mail;
			
	}
	
	public void desc() {
		System.out.println("���� ������ ������ ����ϰ� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}
	
	
		
		// ���α׷� ����
//		Yhjae1004 y = new Yhjae1004();
		Withpd w = new Withpd();
		
//		y.setPosition("���");
//		String posBefore = y.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		y.setPosition("�븮");
	
//		String posAfter = y.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111"; //�ش� Ŭ���� pos���� private�� ������
//		String pos = w.getPosition();
//		System.out.println(pos);
		// ���α׷� ����
	}

