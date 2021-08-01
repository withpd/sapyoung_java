package com.sapyoung.member.rtyou.day20210728;

import com.sapyoung.company.Company;
//import com.sapyoung.dto.UserDto;

public class Main extends Company {
	// extends 상속받아서 컴패니쓰니까 지금 상태에서 메인에 메소드값 없어도 상속받아서 컴패니 클래스 내용 사용 가능
	public static void main (String[] args) {
		Main m = new Main();
		String comName =m.getCompName();
		System.out.println(comName);
		
		
		
		
		
		
		
		
		
		

		
//		//기본 생성자 X
//		UserDto dto = new UserDto();
//		String de = dto.getDepartName();
//		int f = dto.getFloor();
//		System.out.println(f+"층");
//		System.out.println(de);
			
			
		}
		

//		dto.setName("최다영");
//		dto.setDepartName("기타");
//		dto.setFloor(5);
//		dto.setId("로사");
//		dto.setPos("과장");
//		dto.setMail("rosa@saypyoung.com");
//		
//		String name = dto.getName();
//		String pos = dto.getPos();
//		
//		String result = pos + " " + name;
//		System.out.println(result);
//		
//		System.out.println(dto.getMail());
		//dto 예제 끝 
	}
	
// 내가 모든 생성자를 다 넣어서 쓴다면 메인에 생성자 만들어서 하나하나 넣으면 됨.불필요한 경우나 층수같은 자동화할 수 있는 부분은 
// 따로 유저 디티오에서 자동화로 만들어서 관리하면 편함. 생성자를 하나 더 만들어서 관리하면 예외적으로 관리하는 경우 또 만들어서 관리.같은 클래스를 써도 처리하는 과정과 결과가 다름.

