package com.sapyoung.member.histoyw.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Histoyw {
	
	private String pos;
	
	public void setPosition(String position) {
		pos = position;
				
	}
	
		public String getName() {
		String name = "�ۿ��";
		return name;
	}
	
	public String getPosition() {
		
		return pos;
	}
	
	public int getFloor() {
		int floor = 2;
		return floor;
	}
	
	public String getDepartName() {
		String depart = "��̻����";
		return depart;
	}
		
	public String getMail() {
		String mail = "histoyw@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("�뼱�� �ø��� å�����Դϴ�");
	}
	
	public String getId() {
		String classname = getClass().getSimpleName();
		return classname;
	}
		
	public static void main(String[] arg12) {
		//���α׷� ����
		
//		Histoyw h = new Histoyw();
		
		Withpd w = new Withpd();
		
//		h.setPosition("����");
//		String posBefore = h.getPosition();
//		System.out.println("BEFORE : " + posBefore);
		
//		h.setPosition("����");
//		String pos = h.getPosition();
		
//		String posAfter = h.getPosition();
//		System.out.println("AFTER : " + posAfter);
		
//		w.pos = "1111";
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		//���α׷� ����
		
//		Company c = new Company();
//		c.getCompSite();
				
	}
		
}
