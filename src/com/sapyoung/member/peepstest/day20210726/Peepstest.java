package com.sapyoung.member.peepstest.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.imachiri.day20210720.Imachiri;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Peepstest {
	
	// 지역변수 / 전역변수

	
	String pos;
	
	
	public void setPosition(String position) {
		pos = position; 
		System.out.println(position);
		
	}

	public String getName() {
		String name = "이수지";
		return name;
	}
	
	public String getPosition() {
			String position = "사원";
			return position;
	}

	public String getDepartName() {
			String depart = "디지털팀";
			return depart; 
	}


	public String getMail() {
		String mail = "suzylee@sapyoung.com";
		return mail;
	}
	
	public int getFloor() {
	//	int floor = 5;
	//	return floor;
		return 5;
	}

	public void desc() {
		System.out.println("안녕하세요");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		
		return className;
	}
	
	

	
	public static void main(String[] arg12) {
		// 프로그램 시작 
		//Peepstest p = new Peepstest();
		
		Withpd w = new Withpd();

		//p.setPosition("대리");
		//String posBefore = p.getPosition();
		//System.out.println("BEFORE : " + posBefore);
		//p.setPosition("Staff");
		//String posAfter = p.getPosition();
		//System.out.println("AFTER : " + posAfter);

		// 프로그램 종료 
	}

}
