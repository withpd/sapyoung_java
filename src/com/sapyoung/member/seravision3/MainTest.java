package com.sapyoung.member.seravision3;

import com.sapyoung.member.seravision3.day20210802.Work;

public class MainTest {
	public static void main(String[] args) {
		//work (WorkAb, WorkIf)
		Work w = new Work();
		w.init("seravision3");  
		String result = w.getResult();
		System.out.println(result);
	}
}