package com.sapyoung.member.imachiri.day20210729;

import com.sapyoung.company.Company;

public class Main extends Company{

	public static void main(String[] args) {
		Main m = new Main("�ȳ��ϼ���");
		String comName = m.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}

	public Main() {
		super(); // super�� ��ӹ޴� ���� Ŭ����. ���� ��Ȳ������ ��ӹ޴� Ŭ������ Company�� �ǹ��Ѵ�.
		System.out.println("Main �⺻������");
	}
	
	public Main(String str) {
		super(3);
		System.out.println("Main ������ #1");
	}
	
	public Main(int num) {
		System.out.println("Main ������ #2");
	}
	
}