package com.sapyoung.member.yhjae1004.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{
	
	public Main() {
		super(); //�⺻ �����ڿ����� ���� ����
		System.out.println("Main �⺻ ������");
	}
	
	public Main(String str)  {
		super(str);
		System.out.println("Main ������ #1");
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main ������ #2");
	}
	
	public static void main (String[] args) {

		Main m = new Main("3");
		String comName = m.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}
}
