package com.sapyoung.common;

/*
 *  구현 가능(implememts)
 *  추상 메서드만 선언 가능 -> abstract 선언 생략 가능 <-> 추상클래스
 */
public interface WorkIf {
	public void init(String id);		// 읽음
	public abstract String process();	// 읽음
}
