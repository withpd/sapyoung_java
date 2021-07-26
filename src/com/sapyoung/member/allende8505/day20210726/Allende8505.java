package com.sapyoung.member.allende8505.day20210726;

//import com.sapyoung.member.withpd.day20210726.Withpd;

/*import com.sapyoung.company.Company;
import com.sapyoung.member.histoyw.day20210720.Histoyw;*/

public class Allende8505 {
	
	//지역변수 / 전역변수
	private String pos = "사원";		
	
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getPosition() {
		return pos;
	}
	
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
	
	public static void main (String[] args) {
		//프로그램 시작
//		Allende8505 a = new Allende8505();
//		 Withpd w = new Withpd(); 
		
//		a.setPosition("대리");
//		String posBefore = a.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		a.setPosition("팀장");
		
//		String posAfter = a.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		a.pos = "1111";
//		String pos = a.getPosition();
//		System.out.println(pos);
		
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		
		//프로그램 종료
	}
		
}
