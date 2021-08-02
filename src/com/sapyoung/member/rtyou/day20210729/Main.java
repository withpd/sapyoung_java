package com.sapyoung.member.rtyou.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

//상속 클래스 실행이 최우선이고 모든 클래스는 사실 보이지 않는 선언이 자동으로 숨겨진 오브젝트에 상속된다. 

public class Main extends Company { 
	
	public Main() {
		super(); // super = Company -> super() -> Company() super는 상속하는 상위 생성자를 뜻함. 
		System.out.println("Main 기본생성자");
	}
	public Main(String str) {
		super(str);
		System.out.println("Main 생성자 #1");
		
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main 생성자 #2");
		
	}
	
	
	
	public static void main(String[] args) {
		Main m1= new Main();
		//Main m2 = new Main(3);
		//Main m3 = new Main("3");
		String comName =m1.getCompName();
		System.out.println("회사이름: " + comName);
		
//		UserDto dto = new UserDto(5,"기타");
//		String r1111 = dto.getResult();
//		System.out.println(r1111);
//	
	
	
		
		
// 메인만 선언했는데 컴패니 정보를 불러올 수 있는 이유는 컴퍼니 클래스 밑에 있는 객체가 선언된 결과. 메인 메쏘드는 기본이라생략됨.
// 컴패니도 기본생성자에 의해 생성이 되었다고 생각해야함. 
		
		
	}
	
	
}

// 추상 클래스가 뭐지? 클래스가 있고 추상 클래스가 있고 상속 클래스, 오버라이드. ......어렵군
// 클래스 상속됨. 추상 클래스 상속됨. 인터페이스 상속 안됨. 
	
