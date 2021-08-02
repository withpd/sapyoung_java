package com.sapyoung.member.clara.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {	           //상속
	
	public Main(int i) {
		// TODO Auto-generated constructor stub
	}

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public Main(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
//		UserDto dto1 = new UserDto(5, "기타");
//		UserDto dto2 = new UserDto();          //동일 생성자 쓸 때 1, 2 구분
//		String r111 = dto1.getResult();
//		System.out.println(r111);
//		
//		Main m = new Main();                   //상속받아 온 데이터 호출 
//		m.getCompName();
//		m.getCompSite();
//		m.getCompTel();
		
		Main m = new Main("3");
		Main m1 = new Main();           // A회사
		Main m2 = new Main(3);			// C회사
		Main m3 = new Main("사회평론");	// B회사
		String comName = m.getCompName();
		System.out.println("회사이름 : " + comName);
	}
		
		//생성자 호출방식 파라미터 규정하기
	
//		public Main() {
//			System.out.println("Main 기본생성자");
//		}
//		public Main(String str) {
//			super(3);         //super = Company -> super() -> Company() & super(3) -> Company(3)
//				System.out.println("Main 생성자 #1");
//		}		
//		public Main(int num) {
//				System.out.println("Main 생성자 #2");
		}
//	}

