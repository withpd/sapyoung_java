//����: WorkIf�� WorkAb�� �����ϰ�, WorkAb�� Work�� ��ӹ���. Work�� MainTest���� �����.

package com.sapyoung.member.imachiri;

import com.sapyoung.member.imachiri.day20210802.Work;

public class MainTest {

	public static void main(String[] arg) {
		Work w = new Work();
		w.init("allende8505");
		String result = w.getResult();
		System.out.println(result);
	}

}
