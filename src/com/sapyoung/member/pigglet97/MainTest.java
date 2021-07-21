package com.sapyoung.member.pigglet97;

import com.sapyoung.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.pigglet97.day20210720.Pigglet97; /*내가 쓰려는 class의 위치 가져와야 함*/

public class MainTest {
		
	public static void main(String[] arg) {
		Pigglet97 p = new Pigglet97();
		p.getMail();
		p.getCompTel();
		p.getName();
		
		Gerbugi g = new Gerbugi();
		g.getCompName();
		g.getMail();
		g.getCompTel();
		g.getName();
		g.getId();
	} /*main method 가 실행 지점임*/
}
