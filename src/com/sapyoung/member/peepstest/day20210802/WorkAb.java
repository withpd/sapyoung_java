package com.sapyoung.member.peepstest.day20210802;
/*
 * ��� ���� (extends) 
 * �߻� �޼���� �Ϲ� �޼��� ���� ���� -> abstract ���� x
 */

public abstract class WorkAb implements WorkIf{
	public String getResult() {
		String val = process();
		return val;
		
	}
}