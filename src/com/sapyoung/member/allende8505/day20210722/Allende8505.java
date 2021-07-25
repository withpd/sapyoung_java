package com.sapyoung.member.allende8505.day20210722;

/*import com.sapyoung.company.Company;
import com.sapyoung.member.histoyw.day20210720.Histoyw;*/

public class Allende8505 {
	
	public String getName() {
		String name = "박동명";
		return name;
		/* return "박동명"; */
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "사평마케팅";
		return depart;
	}
	
	public String getposition() {
		String pos = "대리";
		return pos;
	}
	
	public String getMail() {
		String mail = "dm8505@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("책 팝니다");
	}
	
	public String getId() {
		String className = (getClass().getSimpleName());
		return className;
	}
	
/*	public static void main (String[] args) {
		Allende8505 a = new Allende8505();
		String name = a.getName();
		String pos = a.getposition();
		
		System.out.println(name + " " + pos);
		a.desc();
		
		Company c = new Company();
		c.getCompSite();
		
		Histoyw h = new Histoyw();
		h.getDepartName();*/
		
	}
