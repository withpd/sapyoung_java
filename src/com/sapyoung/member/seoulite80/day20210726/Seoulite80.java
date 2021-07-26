package com.sapyoung.member.seoulite80.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Seoulite80 {

	private String pos = "사원";
	private String mail = "사원";
	private String id = "사원";
	private String floor = "사원";
	private String departNmae;
	
	public void setPosition(String position) {
		pos = position;
	}

	public String getName() {
		String name = "임현규";
		return name;
	}

	public String getPosition() {
//		String pos = "과장";
		return pos;
	}

	public int getFloor() {
		int floor = 4;
		return floor;
	}

	public String getDepartName() {
		String depart = "아카데미";
		return depart;
	}

	public String getMail() {
		String mail = "hklim@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("신사업팀을 맡고 있습니다.");
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
		 * s.setPosition("과장"); String posBefore = s.getPosition();
		 * System.out.println("BEFORE: " + posBefore);
		 * 
		 * s.setPosition("차장");
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
