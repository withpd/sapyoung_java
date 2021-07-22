package com.sapyoung.member.seoulite80.day20210721;

public class Seoulite80 {

	public String getName() {
		String name = "임현규";
		return name;
	}
	
	public String getPosition() {
		String pos = "과장";
		return pos;
	}
	
	public void getDepartName() {
		System.out.println("아카데미");
	}

	public void getMail() {
		System.out.println("hklim@sapyoung.com");
	}

	public void desc() {
		System.out.println("신사업팀을 맡고 있습니다.");
	}

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Seoulite80 s = new Seoulite80();
		String name = s.getName();
		String pos = s.getPosition();		
		System.out.println("[" + name + " " + pos + "]");
		s.desc();
		
/*		Company c = new Company();
		c.getCompSite();
		
		Gerbugi g = new Gerbugi();
		g.getDepartName();			*/		
	}
	
}
