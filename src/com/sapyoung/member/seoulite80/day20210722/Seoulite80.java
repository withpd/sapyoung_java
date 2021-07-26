package com.sapyoung.member.seoulite80.day20210722;

public class Seoulite80 {

	public String getName() {
		String name = "임현규";
		return name;
	}
	
	public String getPosition() {
		String pos = "과장";
		return pos;
	}

	public int getFloor() {
		int floor = 4;
		return floor;
	}	
	
	public String getDepartName() {
		String depart = "아카데미";
		return depart;
	}

	public String getMail() {
		String mail = "hklim@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("신사업팀을 맡고 있습니다.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}

}
