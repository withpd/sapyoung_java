package com.sapyoung.member.pigglet97.day20210802;

// 추상 클래스 상속(extends) 가능, 추상 메서드와 일반 메서드 선언 가능 <-> abstract 생략불가
public abstract class WorkAb implements WorkIf {
	
	
	public String getResult() {
		String val = process();
		return val;
	}
	
}
