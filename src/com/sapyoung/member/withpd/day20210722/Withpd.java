package com.sapyoung.member.withpd.day20210722;

public class Withpd {

	public String getName() {
		String name = "배성호";
		return name;
	}
	
	public String getPosition() {
//		String pos = "강사";
//		return pos;
		return "강사";
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
	
}





