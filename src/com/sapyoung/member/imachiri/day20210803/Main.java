// 오늘의 주제: 여러 건의 데이터를 한 번에 사용하기! (하나하나 데이터를 코드화시켜 써주기 어려우므로)

package com.sapyoung.member.imachiri.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
// main (string[] args) 괄호 안 부분은 파라미터임. string 클래스 여러개를 - [] 수 만큼의 값들을 args 변수로 처리하겠다는 말.
		String[] strArray = new String[7];
		// strArray라는 변수는 7개의 스트링값을 가질 수 있다.
// 개발에서 수를 셀 때 맨 첫 번쨰 숫자는 항상 0이다. 1이 아님.
		strArray[0] = "값1";
		strArray[1] = "값2";
		strArray[2] = "값3";
		strArray[3] = "값4";
		strArray[4] = "값5";
		strArray[5] = "값6";
		strArray[6] = "값7";

		System.out.println(strArray[1]);
// 전체 나열된 것들 중에서 5번쨰 값을 출력하겠다는 말.

		UserDto[] dtoArray = new UserDto[20];
		UserDto dto1 = new UserDto();
		dto1.setDepartName("부서1");
		dto1.setName("이름1");

		UserDto dto2 = new UserDto();
		dto2.setDepartName("부서2");
		dto2.setName("이름2");

		UserDto dto3 = new UserDto();
		dto3.setDepartName("부서3");
		dto3.setName("이름3");

		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;

// dtoArray 안에 4개의 dto클래스들을 저장해 둔 상태임.

		UserDto resDto = dtoArray[0]; 
		String str = resDto.getName();
		System.out.println(str);
	 
// ArrayList 는 여러 개의 클래스를 담을 수 있는 클래스다.
		ArrayList<UserDto> aList = new ArrayList<>();
		aList.add(dto1);
		aList.add(dto2);
		aList.add(dto3);
		
		aList.get(0).getName();
		System.out.println(aList.get(0).getName());
// ArrayList는 줄세우기 기능. 리스트 안에 몇 개의 값이 있는지 알고 싶다면 size메소드 사용.
		
	}

}
