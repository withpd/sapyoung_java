package com.sapyoung.member.seoulite80.day20210722;

public class Seoulite80 {

	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getPosition() {
		String pos = "����";
		return pos;
	}

	public int getFloor() {
		int floor = 4;
		return floor;
	}	
	
	public String getDepartName() {
		String depart = "��ī����";
		return depart;
	}

	public String getMail() {
		String mail = "hklim@sapyoung.com";
		return mail;
	}

	public void desc() {
		System.out.println("�Ż������ �ð� �ֽ��ϴ�.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
//		System.out.println(className);
		return className;
	}

}
