package com.sapyoung.histoyw.day20210721;

import com.sapyoung.company.Company;


public class Histoyw {
	
	public String getName() {
		String name = "�ۿ��";
		return name;
	}
	
	public String getPosition() {
		String pos = "������";
		return pos;
	}
	
	public void getDepartName() {
		System.out.println("��̻����");
	}
		
	public void getMail() {
		System.out.println("histoyw@sapyoung.com");
	}
	
	public void desc() {
		System.out.println("�뼱�� �ø��� å�����Դϴ�");
	}
	
	public void getId() {
		System.out.println(getClass().getSimpleName());
	}
		
	public static void main(String[] args) {
		Histoyw h = new Histoyw();
		String name = h.getName();
		String pos = h.getPosition();
		
		System.out.println(pos + " " + name);
				
		
		
//		Company c = new Company();
//		c.getCompSite();
				
	}
		
}
