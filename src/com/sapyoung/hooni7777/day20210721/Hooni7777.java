package com.sapyoung.hooni7777.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.rtyou.day20210720.Rtyou;

public class Hooni7777 {
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getPosition() {
		String pos = "������";
		return pos;
	}
	
	public void getDepartName() {
		System.out.println("������");
	}
	
	public void getMail() {
		System.out.println("jason@ebricks.co.kr");
	}
	
	public void desc() {
		System.out.println("Bricks �������� �ð� �ֽ��ϴ�");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}	

	public static void main(String[] args) {
		Hooni7777 h = new Hooni7777();
		String name = h.getName();
		String pos = h.getPosition();
	
		System.out.println(pos + " " +name);
		h.desc();
		
//		Company c = new Company();
//		c.getCompTel();
//		
//		Rtyou r = new Rtyou();
//		r.getDepartName();
		
	
	}
}
