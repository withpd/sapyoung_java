package com.sapyoung.member.unmeblue21;

import com.sapyoung.member.unmeblue21.day20210802.Work;

public class MainTest {
	public static void main(String[] arg) {
		Work w = new Work();
		w.init("heejung");  //id����
		String result = w.getResult();
		System.out.println(result);		
	}
}
 