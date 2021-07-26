package com.sapyoung.member.histoyw.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Histoyw {
	
	private String pos;
	
	public void setPosition(String position) {
		pos = position;
				
	}
	
		public String getName() {
		String name = "송용운";
		return name;
	}
	
	public String getPosition() {
		
		return pos;
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "어린이사업부";
		return depart;
	}
		
	public String getMail() {
		String mail = "histoyw@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("용선생 시리즈 책임자입니다");
	}
	
	public String getId() {
		String classname = getClass().getSimpleName();
		return classname;
	}
		
	public static void main(String[] arg12) {
		//프로그램 시작
		
//		Histoyw h = new Histoyw();
		
		Withpd w = new Withpd();
		
//		h.setPosition("과장");
//		String posBefore = h.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		h.setPosition("차장");
//		String pos = h.getPosition();
		
//		String posAfter = h.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		//프로그램 종료
		
//		Company c = new Company();
//		c.getCompSite();
				
	}
		
}
