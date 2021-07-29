package com.sapyoung.member.unmeblue21.day20210726;

import com.sapyoung.member.withpd.day20210726.Withpd;

public class Unmeblue21 {

	private String pos;
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
	}
	
	public String getName() {
		String name = "최일규";
		return name;
	}

	public int getFloor() {
		int floor = 5;
		return floor;
	}
		
 	public String getDepartName() {
		String depart = "신사업3팀";
		return depart;
	}

	public String getMail() {
		String mail = "with@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("신사업 업무");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		/* System.out.println(className); */
		return className;
	}

	public static void main(String[] arg12) {
		Withpd w = new Withpd();
		
//		w.setPosition("과장");
//		String posBefore = w.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		w.setPosition("차장");
//		
//		String posAfter = w.getPosition();
//		System.out.println("AFTER : " + posAfter);
//		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
	
	}
	
}
