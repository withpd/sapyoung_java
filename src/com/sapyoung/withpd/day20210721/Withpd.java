package com.sapyoung.withpd.day20210721;

public class Withpd {

	public void getName() {
		System.out.println("�輺ȣ");
	}
	
	public void getFloor() {
		System.out.println("5��");
	}
	
	public void getDepartName() {
		System.out.println("��Ÿ");
	}
	
	public void getPosition() {
		System.out.println("����");
	}
	
	public void getMail() {
		System.out.println("withpd@gmail.com");
	}
	
	public void desc() {
		System.out.println("�系 IT ������ �ð� �ֽ��ϴ�.");
	}
	
	private void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public void getCompName() {
		System.out.println("��ȸ���");
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
