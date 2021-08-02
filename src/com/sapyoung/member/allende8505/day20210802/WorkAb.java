package com.sapyoung.member.allende8505.day20210802;

/*
 * 상속 가능(extends)
 * 추상 메서드 일반 메서드 선언 가능 -> abstract 생략 X
 */

public abstract class WorkAb implements WorkIf {
	
	public String getResult() {
		String val = process();
		return val;
	}

}
