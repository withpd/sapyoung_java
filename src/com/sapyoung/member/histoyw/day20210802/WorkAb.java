package com.sapyoung.member.histoyw.day20210802;

/*
 * 상속 가능
 * 추상 메서드와 일반 메서드 선언 가능 -> abstract 생략 X
 */


public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}

	public void desc() {
		System.out.println("WorkAb 추상클래스입니다.");
	}
}
