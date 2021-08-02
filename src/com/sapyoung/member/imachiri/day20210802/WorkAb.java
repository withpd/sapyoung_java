// 추상 클래스 만들기: 패키지 -> ctrl + n -> 클래스 생성. 이름은 WorkAb로 설정, public 라디오 버튼 아래 체크박스 abstract 선택해서 만들것!
// 추상 클래스는 상속이 가능한 공간. 추상 클래스 안에서는 추상 메서드 및 일반 메서드 모두 선언 가능. 그러므로 추상 메서드의 경우 abstract생략해선 안됨. 
// 추상 클래스가 인터페이스를 구현(implements)할 수도 있음.

package com.sapyoung.member.imachiri.day20210802;

/*
 * public abstract class WorkAb {
 * 
 * public abstract void init(); public abstract String process(); public
 * abstract String getResult(); // 추상 클래스에서 추상 메소드를 쓸 땐 꼭 abstract 쓰기! public
 * void desc() { System.out.println("WorkAb 추상클래스입니다."); }
 * 
 * }
 */

public abstract class WorkAb implements WorkIf{
	
	public String getResult() {
		String val = process();
		return val;
	}
}



