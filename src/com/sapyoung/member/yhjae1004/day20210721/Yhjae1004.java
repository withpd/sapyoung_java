package com.sapyoung.member.yhjae1004.day20210721;

import com.sapyoung.company.Company;
import com.sapyoung.member.ysb0807.day20210720.Ysb0807;
public class Yhjae1004 {
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public void getDepartName() {
		System.out.println("�긯���˾ص�");
	}
	
	public String getPosition() {
		String pos = "���";
		return pos;
	}
	
	public void getMail() {
		System.out.println("yhjae92@ebricks.co.kr");
	}
	
	public void desc() {
		System.out.println("���� ������ ������ ����ϰ� �ֽ��ϴ�.");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		Yhjae1004 y = new Yhjae1004();
		String name = y.getName();
		String pos = y.getPosition();
		
		System.out.println("[" + pos + " " + name +"]");
		y.desc();
		
		
		  Company c = new Company(); c.getCompSite();
		  
		  Ysb0807 s = new Ysb0807(); s.getDepartName();
		 
				
	}
}
