package com.sapyoung.member.yhjae1004.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.ysb0807.day20210720.Ysb0807;
public class Yhjae1004 {
	
	public String getName() {
		String name = "������";
		return name;
	}
	
	public String getDepartName() {
		String depart = "���";
		return depart;
	}
	
	public String getPosition() {
		// String pos = "���"; 
		// return pos; 
		return "���";
	}
	
	public int getFloor() {
		// int floor = 3;
		// return floor;
		return 5;
	}
	
	public String getMail() {
		String mail = "yhjae92@ebrick.co.kr";
		return mail;
			
	}
	
	public void desc() {
		System.out.println("���� ������ ������ ����ϰ� �ֽ��ϴ�.");
	}
	
	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;
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
