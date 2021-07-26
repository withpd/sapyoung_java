package com.sapyoung.member.heejung.day20210726;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.company.Company;

public class Heejung {
	
	// 지역변수 / 전역변수
	String pos = "사원";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
//		return "차장";
	}
	
	public String getName() {
		String name = "장희정";
		return name;
	}
	
	public int getFloor() {
		int floor = 3;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "브릭스 R&D";
		return depart;
	}
	
	public String getMail() {
		String mail = "eena@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("교재 개발을 맡고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// 프로그램 시작
		Withpd w = new Withpd();
		
//		h.setPosition("과장");
//		String posBefore = h.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		h.setPosition("차장");
		
//		String posAfter = h.getPosition();
//		System.out.println("AFTER: " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		// 프로그램 종료
	}
	
	
}