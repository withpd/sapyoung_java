package com.sapyoung.member.smjhsh.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Smjhsh {
//	지역변수 / 전역변수
	private String pos;   //직급      
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
//		return "사원";
		
	}
	
	public String getName() {
		String name = "황소희";
		return name;

	}

	public String getDepartName() {
		String depart = "국어팀";
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
		System.out.println("국어 교재를 만듭니다.");

	}

	public String getId() {
		String className = (getClass().getSimpleName());
		System.out.println(className);
		
		return className;

	}

	public static void main(String[] arg12) {
//		Smjhsh w = new Smjhsh();
		
//		프로그램 시작
		Withpd w = new Withpd();
//		w.setPosition("사_원");
//		String posBefore = w.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		w.setPosition("사원");
//		String posAfter = w.getPosition();
//		System.out.println("AFTER : " + posAfter);
//		프로그램 종료
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
	}

	
}

