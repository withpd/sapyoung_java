package com.sapyoung.member.yhjae1004.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Yhjae1004 {
	
	//지역변수 / 전역변수
	String pos = "사원"; //pos변수는 setPosition과 getPosition을 이어주는 매개체
		
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "유희재";
		return name;
	}
	
	public String getDepartName() {
		String depart = "사원";
		return depart;
	}
	
	public String getPosition() {
		return pos; 
		//return "사원";
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
		System.out.println("영어 콘텐츠 개발을 담당하고 있습니다.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
	}
	
	
		
		// 프로그램 시작
//		Yhjae1004 y = new Yhjae1004();
		Withpd w = new Withpd();
		
//		y.setPosition("사원");
//		String posBefore = y.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		y.setPosition("대리");
	
//		String posAfter = y.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111"; //해당 클래서 pos변수 private라서 에러뜸
//		String pos = w.getPosition();
//		System.out.println(pos);
		// 프로그램 종료
	}

