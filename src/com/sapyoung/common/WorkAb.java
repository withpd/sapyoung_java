package com.sapyoung.common;

/*
 * 상속 가능(extends)
 * 추상 메서드와 일반 메서드 선언 가능 -> abstract 생략 x
 */

public abstract class WorkAb implements WorkIf{
	
	public String getResult() { // 읽음
		String val = process();// 읽음
		return val;// 읽음
	}// 읽음
}
