package com.sapyoung.member.hooni7777.day20210722;


public class Hooni7777 {
	
	public String getName() {
		String name = "류정훈";
		return name;
	}
	
	public String getPosition() {
		String pos = "본부장";
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
		Hooni7777 h = new Hooni7777();
		String name = h.getName();
		String pos = h.getPosition();
	
		System.out.println(pos + " " +name);
		h.desc();
		
		
	
	}
}
