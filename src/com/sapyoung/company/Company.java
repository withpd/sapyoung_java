package com.sapyoung.company;

public class Company {
	
	String comName;
	
	public Company() {
		System.out.println("Company �⺻ ������");
		comName = "Aȸ��";
	}
	
	public Company(String str) {
		System.out.println("Company ������ #1");
		comName = "Bȸ��";
	}

	public Company(int num) {
		System.out.println("Company ������ #2");
		comName = "Cȸ��";
	}
	
	public String getCompName() {
		return comName;
	}
	public String getCompTel() {
		return "ȸ�翬��ó";
	}
	public String getCompSite() {
		return "ȸ��Ȩ������";
	}
}
