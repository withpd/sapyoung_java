package com.sapyoung.member.ecodooly8.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.hooni7777.day20210720.Hooni7777;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Ecodooly8{

	// ���� - ������ ������ �ǵ帮�� ���ϰ� private�� ����.
	private	String pos = "���";
	private String name;
	private String mail;
	private String departname;
	
	// ����
	
	public void setPosition(String position) {
		pos = position;
	}
	
	public String getName() {
		String name = "������";
		return name;
	}

	public int getFloor() {
	//	int floor = -1;
	//	return floor;
		return -1;
	}
	
	public String getDepartname() {
		String dep = "�����л����";
		return dep;
	}
	
	public String getMail() {
		String mail = "onetwo12@sapyoung.com";
		return mail;
	}
	
	public void desc() {
		System.out.println("�����л���� �Ż�� ��ȹ�� �����ϰ� �ֽ��ϴ�.");
	}

	public String getId() {
		String className = getClass().getSimpleName();
		return className;
	}
	
	
	/*
	 * public static void main(String[] args) { // ���α׷� ���� Withpd w = new Withpd();
	 * w.pos = "1111"; String pos = w.getPosition(); System.out.println(pos); //
	 * ���α׷� ���� }
	 */
	
	
}






