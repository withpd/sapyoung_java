package com.sapyoung.member.imachiri.day20210728;

import com.sapyoung.company.Company;

// extends�� ����� �ǹ���
public class Main extends Company{    // main class
	public static void main(String[] arg) {    // main method. ���������� ������ �ϴ� ������ �� ��� ����.
		Main m = new Main(); // main class�� ��ü�� ������
		String comName = m.getCompName(); // company class�� ��������Ƿ� main class �� ��ü �ȿ� ��ӵ� ������ ����� �� ����.
		System.out.println(comName);
	}
	
}