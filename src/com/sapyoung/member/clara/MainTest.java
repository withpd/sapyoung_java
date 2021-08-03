package com.sapyoung.member.clara;

import com.sapyoung.member.clara.day20210802.Work;

public class MainTest {
	public static void main(String[] arg) {
		//Work (WorkAb, WorkkIf)
		Work w = new Work();
		w.init("clara");  //id¼³Á¤
		w.process();
		String result = w.getResult();
		System.out.println(result);
		
	}
}
