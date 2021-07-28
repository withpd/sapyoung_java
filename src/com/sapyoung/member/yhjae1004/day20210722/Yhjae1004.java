package com.sapyoung.member.yhjae1004.day20210722;

import com.sapyoung.company.Company;
import com.sapyoung.member.ysb0807.day20210720.Ysb0807;
public class Yhjae1004 {
	
	public String getName() {
		String name = "유희재";
		return name;
	}
	
	public String getDepartName() {
		String depart = "사원";
		return depart;
	}
	
	public String getPosition() {
		// String pos = "사원"; 
		// return pos; 
		return "사원";
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
		System.out.println("영어 콘텐츠 개발을 담당하고 있습니다.");
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
