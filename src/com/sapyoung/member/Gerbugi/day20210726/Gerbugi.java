package com.sapyoung.member.Gerbugi.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Gerbugi {
	
		String pos;
		
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
//		return "이사";
	}
	
	public String getName() {
		String name = "나연희";
		return name;
	}
	
	
	
	
	public int getFloor() {
//		int floor = "5";
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "경영지원본부";
		return depart;
	}
	
	public String getMail() {
		String mail = "nagobugi@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		String desc = "경지를 총괄하고 있습니다.";
		System.out.println(desc);
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		Gerbugi g = new Gerbugi();
		
//		g.setPosition("과장");
//		String posBefore = g.getPosition();
//		System.out.println("Before:" + posBefore);
//		
//		g.setPosition("대리");
//		
//		String posAfter = g.getPosition();
//		System.out.println("After:" + posAfter);
		
//		Withpd w = new Withpd();
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
	}
}
