package com.sapyoung.member.allende8505.day20210802;

/*
 * ��� ����(extends)
 * �߻� �޼��� �Ϲ� �޼��� ���� ���� -> abstract ���� X
 */

public abstract class WorkAb implements WorkIf {
	
	public String getResult() {
		String val = process();
		return val;
	}

}
