package com.sapyoung.member.smjhsh.day20210722;

public class Smjhsh {
	public String getName() {
		String name = "Ȳ����";
		return name;

	}

	public static void main(String[] args) {
		
	}
	
	public String getPosition() {
		String pos = "���";
		return pos;
		
	}
	
	public String getDepartName() {
		String depart = "������";
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
		System.out.println("���� ���縦 ����ϴ�.");

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

