package com.sapyoung.member.cswmil.day20210802;

/*
 * ��� ����(extends)
 * �߻� �޼���� �Ϲ� �޼��� ���� ���� -> abstract ���� X 
 */

public abstract class WorkAb implements WorkIf{

	
	public String getResult() {
		String val = process();
		return val;
	}
}
