package com.sapyoung.member.unmeblue21.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public Main() {
		System.out.println("Main �⺻������");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main ������ #1");
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main ������ #2");
	}
	
	public static void main(String[] args) {
		Main m1 = new Main();		// Aȸ��
//		Main m2 = new Main(3);		// Bȸ��
//		Main m3 = new Main("3");	// Cȸ��
		String comName = m1.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}
	
}
