package com.sapyoung.member.augreen.day20210802;


/*
 * 구현 가능 (implements)
 * 추상 메서드만 선언 가능 -> abstract 선언 생략 가능 <-> 추상클래스
 */

public interface WorkIf {
	public void init(String id);
	public abstract String process();
}
