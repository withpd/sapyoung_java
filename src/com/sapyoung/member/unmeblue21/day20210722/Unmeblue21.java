package com.sapyoung.member.unmeblue21.day20210722;

public class Unmeblue21 {

	public String getName() {
		String name = "최일규";
		return name;
	}

	public String getPosition() {
		String position = "차장";
		return position;
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

}
