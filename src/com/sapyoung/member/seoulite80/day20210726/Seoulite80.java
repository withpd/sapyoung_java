package com.sapyoung.member.seoulite80.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Seoulite80 {

	private String pos = "���";
	private String mail = "���";
	private String id = "���";
	private String floor = "���";
	private String departNmae;
	
	public void setPosition(String position) {
		pos = position;
	}

	public String getName() {
		String name = "������";
		return name;
	}

	public String getPosition() {
//		String pos = "����";
		return pos;
	}

	public int getFloor() {
		int floor = 4;
		return floor;
	}

	public String getDepartName() {
		String depart = "��ī����";
		return depart;
	}

	public String getMail() {
		String mail = "hklim@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("�Ż������ �ð� �ֽ��ϴ�.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		/*
		 * Seoulite80 s = new Seoulite80();
		 * 
		 * s.setPosition("����"); String posBefore = s.getPosition();
		 * System.out.println("BEFORE: " + posBefore);
		 * 
		 * s.setPosition("����");
		 * 
		 * String posAfter = s.getPosition(); System.out.println("AFTER: " + posAfter);
		 * 
		 * s.pos = "1111"; String pos = s.getPosition(); System.out.println(pos);
		 */

		/*
		 * Withpd w = new Withpd();
		 * 
		 * w.pos = "1111"; String pos = w.getPosition(); System.out.println(pos);
		 */

	}

}
