package com.sapyoung.member.histoyw.day20210802;

/*
 * ��� ����
 * �߻� �޼���� �Ϲ� �޼��� ���� ���� -> abstract ���� X
 */


public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}

	public void desc() {
		System.out.println("WorkAb �߻�Ŭ�����Դϴ�.");
	}
}
