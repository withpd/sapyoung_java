package com.sapyoung.member.Gerbugi.day20210802;

/* abstract class 특징
 * 상속 가능(extends)
 * 추상 메서드(abstract 필수)와 일반 메서드 둘다 선언 가능 
 */
public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String va1 = process();
		return va1;
	}
	
}
