package com.sapyoung.member.smjhsh.day20210722;

public class Smjhsh {
	public String getName() {
		String name = "황소희";
		return name;

	}

	public static void main(String[] args) {
		
	}
	
	public String getPosition() {
		String pos = "사원";
		return pos;
		
	}
	
	public String getDepartName() {
		String depart = "국어팀";
		return depart;

	}


	public String getMail() {
		String mail = "smj21@sapyoung.com";
		return mail;

	}

	public int getFloor() {
		int floor = 2;
		return floor;

	}

	public void desc() {
		System.out.println("국어 교재를 만듭니다.");

	}

	public String getId() {
		String className = (getClass().getSimpleName());
		System.out.println(className);
		
		return className;

	}

//	public static void main(String[] args) {
//		Smjhsh smjhsh = new Smjhsh();
//		smjhsh.desc();
//		String id = smjhsh.getId();
//		System.out.println(id);
//}
	
}

