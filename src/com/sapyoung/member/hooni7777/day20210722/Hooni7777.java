package com.sapyoung.member.hooni7777.day20210722;


public class Hooni7777 {
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getPosition() {
		String pos = "������";
		return pos;
	}
	
	public int getFloor() {
//		int floor = "-1";
//		return floor;
		return -1;
	}
	
	public String getDepartName() {
		String depart = "������";
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
		System.out.println("Bricks �������� �ð� �ֽ��ϴ�");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		return className;
//		System.out.println(getClass().getSimpleName());
	}	

	public static void main(String[] args) {
		Hooni7777 h = new Hooni7777();
		String name = h.getName();
		String pos = h.getPosition();
	
		System.out.println(pos + " " +name);
		h.desc();
		
		
	
	}
}
