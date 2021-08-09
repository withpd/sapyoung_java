package com.sapyoung.member.Gerbugi.day20210802;

/* interface 특징
 * 구현가능(implements)
 * 추상 메서드만 선언 가능 -> abstract 선언 생략 가능  <-> abstract class 
 */
public interface WorkIf {
//	접근자            리턴형   메서드()
	public abstract void init(String id);
	public abstract String process();

}
