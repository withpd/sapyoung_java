package com.sapyoung.member.smjhsh.day20210802;

//��� ����. �߻� �޼���� �Ϲ� �޼��� ���� ����. abstract ���� �Ұ�.

public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}
}
