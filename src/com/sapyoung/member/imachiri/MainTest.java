//구조: WorkIf를 WorkAb가 구현하고, WorkAb를 Work가 상속받음. Work를 MainTest에서 사용함.

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
