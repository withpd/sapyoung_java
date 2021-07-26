package com.sapyoung.member.hooni7777.day20210726;

import com.sapyoung.member.Gerbugi.day20210721.Gerbugi;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Hooni7777 {
	
	String pos = "사원";
	
	public void setPosition(String position) {
		pos = position;
	}
	
	
	public String getName() {
		String name = "류정훈";
		return name;
	}
	
	public String getPosition() {
		return pos;
	}
	
	public int getFloor() {
//		int floor = "-1";
//		return floor;
		return -1;
	}
	
	public String getDepartName() {
		String depart = "마케팅";
		return depart;
	}
	
	public String getCompTel() {
		String comptel = "02-335-7399";
		return comptel;
	}
	
	public String getMail() {
		String mail = "jason@ebricks.co.kr";
		return mail;
	}
	
	public void desc() {
		System.out.println("Bricks 마케팅을 맡고 있습니다");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		return className;
//		System.out.println(getClass().getSimpleName());
	}	

	
	public static void main(String[] args) {
		Withpd w = new Withpd();
//		h.setPosition("과장");
//		String posBefore = h.getPosition();
//		System.out.println("Before : " + posBefore);
//
//		h.setPosition("차장");
//		
//		String posAfter = h.getPosition();
//		System.out.println("After : " + posAfter);

		w.pos = "1111";
		String pos = w.getPosition();
		System.out.println(pos);
		
	}
}
