package com.sapyoung.member.unmeblue21.day20210802;

// 아래에서 abstract 생략하면 일반 클래스가 됨. abstaract 있어서 추상 클래스인 것.
// 클래스에서는 추상 메소드와 일반 메소드 둘다 선언 가능하기때문에 추상 메소드면 꼭 abstract 명기해야 함.
// 상속 가능(extends)

public abstract class WorkAb implements WorkIf{

		public String getResult() {
			String val = process();
			return val;
					
			
			
		}
			
}
