package com.sapyoung.common;

/*
 * ��� ����(extends)
 * �߻� �޼���� �Ϲ� �޼��� ���� ���� -> abstract ���� x
 */

public abstract class WorkAb implements WorkIf{
	
	public String getResult() { // ����
		String val = process();// ����
		return val;// ����
	}// ����
}
