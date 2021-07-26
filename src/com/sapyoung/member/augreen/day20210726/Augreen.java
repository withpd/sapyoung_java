package com.sapyoung.member.augreen.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.histoyw.day20210720.Histoyw;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Augreen {
	
	// 지역변수 / 전역변수
	
	
	private String pos = "사원";    //직급
	private String mail;           //이메일
	private String id;
	private String floor;
	private String departName;
	
	
	
	
	
	public void setPosition(String position) {
		
			
		pos = position;
		
	//	System.out.println(position);
	}
	
	public String getName() {
		String name = "고하영";		
		return name;
	}

	
	public String getDepartName() {
		String depart = "아카데미";
		return depart;
	}

	public int getFloor() {
//		int floor = 4;
//		return floor;
		return 5;
	}
	
	public String getPosition() {
//		String pos = "대표";
		return pos;
//		return "대표";
	}
	
	public String getMail() {
		String mail = "kohayoung@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("아카데미 운영");
	}

	public String getId() {
		String className = getClass().getSimpleName();		
		System.out.println(className);
		return className;
	}

	public static void main(String[] args) {
		// 프로그램 시작
		
		/*
		 * Augreen a = new Augreen();
		 * 
		 * 
		 * 
		 * a.setPosition("과장"); String posBefore = a.getPosition();
		 * System.out.println("BEFORE : " + posBefore);
		 * 
		 * String posAfter = a.getPosition(); System.out.println("AFTER : " + posAfter);
		 */
		 
		
		/*
		 * Withpd w = new Withpd(); w.pos = "1111"; String pos = w.getPosition();
		 * System.out.println(pos);
		 */
		
		/*
		 * String name = a.getName(); // String pos = a.getPosition(); //
		 * System.out.println(pos); a.setPosition("차장"); // String pos =
		 * a.getPosition(); System.out.println(pos);
		 * 
		 * 
		 * 
		 * 
		 * // String posAfter = a.getPosition(); System.out.println("AFTER :" +
		 * posAfter);
		 * 
		 * 
		 * System.out.println("[" + pos + " " + name + "]"); a.desc();
		 * 
		 * 
		 * // Company c = new Company(); // c.getCompSite();
		 * 
		 * // Histoyw h = new Histoyw(); // h.getDepartName();
		 */	
		}
}