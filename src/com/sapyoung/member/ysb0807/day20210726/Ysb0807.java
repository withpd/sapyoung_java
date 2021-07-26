package com.sapyoung.member.ysb0807.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Ysb0807 {
	
	// 지역변수 / 전역변수
	String pos = "사원";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "윤수빈";
		return name;
	}

	public String getDepartName() {
		String depart = "브릭스알앤디";
		return depart;
	}
	
	public int getFloor() {
		// int floor = 3; 
		// return floor;
		return 5;
	}
	
	public String getPosition () {
		return pos;
		// return "강사";
	}
	
	public String getMail () {
		String mail = "ysb0807@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("교재 개발을 맡고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		
		return className;
	}
	
	public static void main(String[] arg12) {
		// 프로그램 시작
		Withpd w = new Withpd();
		
		// y.setPosition("과장");
		// String posBefore = y.getPosition();
		// System.out.println("BEFORE : " + posBefore);
		
		// y.setPosition("대리");
		
		// String posAfter = y.getPosition();
		// System.out.println("AFTER : " + posAfter);
		
		//w.pos = "1111";
		//String pos = w.getPosition();
		//System.out.println(pos);
		
		// 프로그램 종료
	}
	
}
