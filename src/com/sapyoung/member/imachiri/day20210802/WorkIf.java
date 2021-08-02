//오늘의 패키지 생성 -> 패키지 안에 ctrl+n 눌러서 interface 검색 -> WorkIf 제목으로 인터페이스 생성.
//인터페이스에서는 '구현(implements)'의 대상이다. 반면 추상 클래스는 '상속(extends)'의 대상이다.
//인터페이스서는 추상 메서드(abstract, 중괄호 사용하지 않음)만 선언이 가능한데, 이 때 abstract 라는 단어는 생략해도 된다. 인터페이스에서는 무조건 추상 메소드만 들어가기 때문.<-> 추상 클래스
//인터페이스는 일종의 구조 역할을 함. 여러 사람들이 하나의 인터페이스를 공유할 경우, 모두 같은 구성을 갖게 됨. 


package com.sapyoung.member.imachiri.day20210802;

public interface WorkIf {

// public abstract void init(); 에서 abstract라는 이름은 생략함.
// init이라는 메서드를 통해 초기화 및 설정 작업
// process 메서드를 통해 작업 시작
// getResult 메서드를 통해 결과물 확인. 단, 결과값을 가져오는 메서드이므로 리턴형이 void여서는 안된다. 원하는 결과값에 따라 String등의 리턴형 사용. 

	public void init(String id);
	public String process();

}
