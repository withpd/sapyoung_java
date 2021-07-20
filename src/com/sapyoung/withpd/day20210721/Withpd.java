package com.sapyoung.withpd.day20210721;

public class Withpd {

	public void getName() {
		System.out.println("배성호");
	}
	
	public void getFloor() {
		System.out.println("5층");
	}
	
	public void getDepartName() {
		System.out.println("기타");
	}
	
	public void getPosition() {
		System.out.println("강사");
	}
	
	public void getMail() {
		System.out.println("withpd@gmail.com");
	}
	
	public void desc() {
		System.out.println("사내 IT 교육을 맡고 있습니다.");
	}
	
	private void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public void getCompName() {
		System.out.println("사회평론");
	}
	
	public void getCompTel() {
		System.out.println("02-326-1182");
	}

	public void getCompSite() {
		System.out.println("https://www.sapyoung.com");
	}
	
	public static void main(String[] args) {
		Withpd w = new Withpd();
		w.getId();
	}
	
}
