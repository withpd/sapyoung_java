package com.sapyoung.member.clara.day20210802;

//상속(extends) 가능
//추상메서드와 일반메서드 선언 가능 ->abstract 생략 못함

public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}
}
