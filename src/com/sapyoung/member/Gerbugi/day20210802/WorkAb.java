package com.sapyoung.member.Gerbugi.day20210802;

/* abstract class Ư¡
 * ��� ����(extends)
 * �߻� �޼���(abstract �ʼ�)�� �Ϲ� �޼��� �Ѵ� ���� ���� 
 */
public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String va1 = process();
		return va1;
	}
	
}
