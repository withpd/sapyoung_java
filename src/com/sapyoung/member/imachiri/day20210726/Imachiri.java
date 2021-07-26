package com.sapyoung.member.imachiri.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Imachiri {

	// 원본 - 원본은 남들이 건드리지 못하게 private로 설정.
	private	String pos = "사원";
	private String name;
	private String mail;
	private String departname;
	
	// 원본
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "안가은";
		return name;
	}

	public int getFloor() {
	//	int floor = -1;
	//	return floor;
		return -1;
	}
	
	public String getDepartname() {
		String dep = "디지털사업팀";
		return dep;
	}
	
	public String getMail() {
		String mail = "gean716@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("디지털사업팀 신사업 기획에 참여하고 있습니다.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		return className;
	}
	
	
	/*
	 * public static void main(String[] args) { // 프로그램 시작 Withpd w = new Withpd();
	 * w.pos = "1111"; String pos = w.getPosition(); System.out.println(pos); //
	 * 프로그램 종료 }
	 */
	
	
}






