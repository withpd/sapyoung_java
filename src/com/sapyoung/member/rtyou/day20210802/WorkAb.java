package com.sapyoung.member.rtyou.day20210802;
/*
 * 상속 가능 (extends) 
 * 추상 메서드와 일반 메서드 선언 가능 -> abstract 생략 x
 */

public abstract class WorkAb implements WorkIf{
	public String getResult() {
		String val = process();
		return val;
		
	}
}
