package com.sapyoung.member.ysb0807.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.yhjae1004.day20210720.Yhjae1004;

public class Ysb0807 {
	
	public String getName() {
		String name = "������";
		return name;
	}

	public void getDepartName() {
		System.out.println("�긯���˾ص�");
	}
	
	public String getPosition () {
		String pos = "���";
		return pos;
	}
	
	public void getMail () {
		System.out.println("ysb0807@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("���� ������ �ð� �ֽ��ϴ�.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Ysb0807 y = new Ysb0807();
		String name = y.getName();
		String pos = y.getPosition();
		
		System.out.println("[" + pos + " " + name + "]");
		y.desc();
		
		Company c = new Company();
		c.getCompSite();
		
		Yhjae1004 w = new Yhjae1004();
		w.getDepartName();
		
	}
	
}
