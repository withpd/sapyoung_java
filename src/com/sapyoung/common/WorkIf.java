package com.sapyoung.common;

/*
 *  ���� ����(implememts)
 *  �߻� �޼��常 ���� ���� -> abstract ���� ���� ���� <-> �߻�Ŭ����
 */
public interface WorkIf {
	public void init(String id);		// ����
	public abstract String process();	// ����
}
