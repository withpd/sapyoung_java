package com.sapyoung.member.augreen.day20210802;

/*
 * ��� ����(extends)
 * �߻� �޼���� �Ϲ� �޼��� ���� ���� -> abstract ���� x 
 * */


public abstract class WorkAb implements WorkIf{
	
	public String getResult() {
		String val = process();
		return val;
	}
	public void desc() {
	System.out.println("WorkAb �߻�Ŭ�����Դϴ�.");
	}
}
