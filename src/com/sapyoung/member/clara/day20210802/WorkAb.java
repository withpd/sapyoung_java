package com.sapyoung.member.clara.day20210802;

//���(extends) ����
//�߻�޼���� �Ϲݸ޼��� ���� ���� ->abstract ���� ����

public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}
}
