package com.sapyoung.member.seravision3.day20210721;

import com.sapyoung.member.allende8505.day20210720.Allende8505;
import com.sapyoung.company.Company;

public class Seravision3 {

	public String getName() {
		String name = "�輼��";
		return name;
	}
		
	public String getPosition() {
		String pos = "����";
		return pos;
	}




	public void getDepartName() {
		System.out.println("��������");
	}


	public void getMail() {
		System.out.println("seravision@gmail.com");
	}

	public void desc() {
		System.out.println("�系 IT ������ �ð� �ֽ��ϴ�.");
	}

	public void getId() {
		System.out.println(getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Seravision3 w = new Seravision3();
        String name = w.getName();
        String pos = w.getPosition();
        
        System.out.println("["+ pos +" "+name +"]");
        
        Company c = new Company();
        c.getCompSite();	
        
        Allende8505 s = new Allende8505();
        s.getDepartName();
        
        
        
	}
	
	
	
	
	
}
