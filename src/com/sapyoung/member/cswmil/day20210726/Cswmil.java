package com.sapyoung.member.cswmil.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Cswmil {
	
	// 지역변수 / 전역변수
	String pos = "사원";
	
	public void setPosition(String position) {
		pos = position;
		
	}

	public String getName() {
		String name = "천성우";
		return name;
	}
	
	public String getPosition() {
		return pos;
//		return "차장";
	}

	public int getFloor() {
		int floor = -1;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "브릭스 마케팅본부";
		return depart;
	}
	
	public String getMail() {
		String mail = "cswmil@ebricks.co.kr";
		return mail;
	}
	
	public void desc() {
		System.out.println("교재 마케팅을 맡고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// 프로그램 시작
		Withpd w = new Withpd();
		
//		c.setPosition("과장");
//		String posBefore = c.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		c.setPosition("차장");
		
				
//		String posAfter = c.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		// 프로그램 종료
	}
	
	
}
