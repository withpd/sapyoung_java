package com.sapyoung.member.unmeblue21;

import com.sapyoung.company.Company;
import com.sapyoung.member.unmeblue21.day20210722.Unmeblue21;

public class MainTest {
	public static void main(String[] arg) {
		
		Unmeblue21 un = new Unmeblue21();
		String name = un.getName();
		String pos = un.getPosition();
		un.getFloor();
		
		System.out.println("[" + pos + " " + name + "]");
		
		un.desc();
		String id = un.getId();
		id = "[" + id + "]" + 12345;
		
		System.out.println(id);
				
		Company co = new Company();
		co.getCompName();
		co.getCompTel();
				
	}
}
