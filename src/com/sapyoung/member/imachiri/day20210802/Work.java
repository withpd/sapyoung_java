// 오늘의 패키지에 ctrl + n -> Work라는 이름의 일반 클래스 만들기
// 일반 클래스에서 인터페이스라는 프레임을 사용할 땐 WorkIf를 구현(implements)해야한다. 

package com.sapyoung.member.imachiri.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.imachiri.day20210726.Imachiri;
import com.sapyoung.member.ecodooly8.day20210726.Ecodooly8;
import com.sapyoung.member.hooni7777.day20210726.Hooni7777;
import com.sapyoung.member.peepstest.day20210726.Peepstest;
import com.sapyoung.member.pigglet97.day20210726.Pigglet97;

public class Work extends WorkAb{
		//같은 패키지 안에 있는 인터페이스이므로 굳이 import 안해도 됨.
		   //빨간 줄 생겼다면 클릭해서 add unimplemented methods 선택 -> 인터페이스 속 추상 메소드를
		   //오버라이드(인터페이스에서 그대로 끌어온 추상 메소드라고 강제하는 행위)한다. //반면, 추상 클래스를 상속 받을 경우, 상속된 내용에
		   //자유롭게 덧붙일 수 있음. (상속과 구현의 차이점)
		
		private String id;
		// 과거 Dto에서 만들었던 id 정보 끌어오기   
			
		@Override
		public void init(String id) {
			this.id = id;
		}

		@Override
		public String process() {
			String result; // if문 밖에서 결과값에 대한 유형(string)을 선언해 버리면 굳이 아래에서 일일이 string이라고 써줄 필요 없다. 
			
			if(id.equals("imachiri")) {
		//등호가 2개면 '같다'라는 뜻. 단, 숫자에만 해당하고 스트링타입(문자타입)이 같다고 쓰고 싶다면 마침표(period)를 쓰고 equals 메소드를 써야 함.
				Imachiri i = new Imachiri();
				result = i.getMail();
			} 
			
			else if(id.equals("allende8505")) {
				Allende8505  a = new Allende8505();
				result = a.getMail();
			}
			
			else if(id.equals("ecodooly8")) {
				Ecodooly8  e = new Ecodooly8();
				result = e.getMail();
			}
				
			else if(id.equals("hooni7777")) {
				Hooni7777  h = new Hooni7777();
				result = h.getMail();
			}
				
			else if(id.equals("peepstest")) {
				Peepstest  p = new Peepstest();
				result = p.getMail();
			}
			
			else if(id.equals("pigglet97")) {
				Pigglet97  l = new Pigglet97();
				result = l.getMail();
			}
			
			else {
				result = "없음";
			}
			
			return result;
		}


			
		} 
 
 
 
