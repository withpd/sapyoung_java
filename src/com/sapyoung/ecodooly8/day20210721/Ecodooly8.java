package com.sapyoung.ecodooly8.day20210721;

public class Ecodooly8 {
	
	public void getName() {
		System.out.println("±èÁö¹Î");
	}

	public void getDepartName() {
		System.out.println("µğÁöÅĞ»ç¾÷ÆÀ");
	}
	
	public void getPosition() {
		System.out.println("Á÷¿ø");
	}
	
	public void getMail() {
		System.out.println("onetwo12@ebricks.co.kr");
	}
	
	public void desc() {
		System.out.println("µğÁöÅĞ»ç¾÷ÆÀ ´ã´çÀÔ´Ï´Ù");
	}
	

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args ) {
		Ecodooly8 w = new Ecodooly8();
		w.getMail();
		
	}
}
		