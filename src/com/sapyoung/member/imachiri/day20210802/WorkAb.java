// �߻� Ŭ���� �����: ��Ű�� -> ctrl + n -> Ŭ���� ����. �̸��� WorkAb�� ����, public ���� ��ư �Ʒ� üũ�ڽ� abstract �����ؼ� �����!
// �߻� Ŭ������ ����� ������ ����. �߻� Ŭ���� �ȿ����� �߻� �޼��� �� �Ϲ� �޼��� ��� ���� ����. �׷��Ƿ� �߻� �޼����� ��� abstract�����ؼ� �ȵ�. 
// �߻� Ŭ������ �������̽��� ����(implements)�� ���� ����.

package com.sapyoung.member.imachiri.day20210802;

/*
 * public abstract class WorkAb {
 * 
 * public abstract void init(); public abstract String process(); public
 * abstract String getResult(); // �߻� Ŭ�������� �߻� �޼ҵ带 �� �� �� abstract ����! public
 * void desc() { System.out.println("WorkAb �߻�Ŭ�����Դϴ�."); }
 * 
 * }
 */

public abstract class WorkAb implements WorkIf{
	
	public String getResult() {
		String val = process();
		return val;
	}
}



