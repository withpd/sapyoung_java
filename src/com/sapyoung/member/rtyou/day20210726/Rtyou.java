package com.sapyoung.member.rtyou.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.peepstest.day20210720.Peepstest;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Rtyou {
	// 지역 변수(local variable)와 영역 변수: 로컬이니까 내가 쓰고 있는 컴퓨터 각각이 지역 변수임. 

	//보이드니까 리턴 필요없음. set은 호출하는 곳에서 내가 원하는 곳에 어떤 값을 넣겠다는 의미. 
	//set과 get은 반대임. 둘은 쌍으로 필요함. 
	
	private String pos;
	private String mail;
	private String id;
	private String floor;
	private String departName;
	
	public void setPosition(String position) {
		pos = position;
			}
	
	public String getPosition() {		
		return pos;
		
	}
	
	
	public String getName() {
		String name = "최다영";
		return name;
	}	
	
	
	
	public int getFloor() {
		int floor = 2;
		return floor;
		
	}
	
	
	public String getDepartName() {
		String depart ="국어팀";
		return depart;

	}


	public String getMail() {
		String mail ="rosa@sapyoung.com";
		return mail;

	}

	public void desc() {
		System.out.println("국어 교재를 만듭니다.");

	}
	


	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;

	}
	
	
	
	
	public static void main(String[] args) {
		//프로그램 시작
		Rtyou r = new Rtyou();		
		Withpd w = new Withpd();
		
		r.pos = "1111";
		String pos = r.getPosition();
		System.out.println(pos);
		
	
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		//위처럼 하지 않는 이유는 관리자가 원본을 관리하기 위함. 
		
//		r. setPosition("대리");
//		String posBefore = r.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		r. setPosition("과장");
//		중간에 셋포지션 이용해서 겟포지션의 변수값을 바꿔주기 때문에 비포 대리, 애프터 과장으로 수정. VO라고 불
//					
//		String pos = r.getPosition();
//		String posAfter = r.getPosition();
//		System.out.println("AFTER :" + posAfter);
//		
//		System.out.println(pos);
		//위는 셋 포지션에서 넘긴 값 출력이고, 위 r은 겟 포지션에서 얻은 값. 
		// 위에 과장인데 String 변수로 셋 포지션에 대리로 하고 넣어서 작용. 
		
		
		
		//프로그램 종료
	
	}
	
	

}
