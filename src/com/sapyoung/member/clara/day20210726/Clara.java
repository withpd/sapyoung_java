package com.sapyoung.member.clara.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Clara {
	String pos;
	
public void setPosition(String position) {
	pos = position;
}

public String getPosition() {
	return pos;
//	return "대표";
}

public String getName() {
	String name = "이애숙";
	return name;
}


public int getFloor() {
//	int floor = "3";
//	return floor;
	return 3;
}

public String getDepartName() {
	String depart = "bricks";
	return depart;
}

public String getMail() {
	String mail = "las@ebricks.co.kr";
	return mail;
}

public void desc() {
	String desc = "R&D";
	System.out.println(desc);
}

public String getId() {
	String className = getClass().getSimpleName();
	System.out.println(className);
	return className;
}

public static void main(String[] args) {
	Clara c = new Clara();
	
//	g.setPosition("과장");
//	String posBefore = g.getPosition();
//	System.out.println("Before:" + posBefore);
//	
//	g.setPosition("대리");
//	
//	String posAfter = g.getPosition();
//	System.out.println("After:" + posAfter);
	
//	Withpd w = new Withpd();
//	w.pos = "1111";
//	String pos = w.getPosition();
//	System.out.println(pos);
	
}
}
