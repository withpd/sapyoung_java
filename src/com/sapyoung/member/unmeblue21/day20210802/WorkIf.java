package com.sapyoung.member.unmeblue21.day20210802;

// 인터페이스에서는 추상 메소드만 선언 가능하기때문에 메소드에 굳이 abstract라고 명기 안해도 된다.
// 구현 가능(implements)

public interface WorkIf {
	
	public abstract void init(String id);
	public abstract String process();
	
}
