package com.sapyoung.member.withpd.day20210726;

import java.util.Iterator;

import com.sapyoung.member.allende8505.day20210722.Allende8505;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.smjhsh.day20210720.Smjhsh;

public class Withpd {

	// 지역변수 / 전역변수
	String pos = "사원";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	private String getPosition() {
		return pos;
//		return "강사";
	}

	public String getName() {
		String name = "배성호";
		return name;
	}
	

	public int getFloor() {
//		int floor = 5;
//		return floor;
		return 5;
	}
	
	public String getDepartName() {
		String depart = "기타";
		return depart;
	}
	
	public String getMail() {
		String mail = "withpd@gmail.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("사내 IT 교육을 맡고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}
	
	public static void main(String[] arg12) {
		// 프로그램 시작
		Withpd w = new Withpd();
//		w.setPosition("과장");
//		String posBefore = w.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		w.setPosition("차장");
//		
//		String posAfter = w.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
		w.pos = "1111";
		String pos = w.getPosition();
		System.out.println(pos);
		
		// 프로그램 종료
	}
}





