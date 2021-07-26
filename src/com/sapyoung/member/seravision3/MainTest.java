package com.sapyoung.member.seravision3;

import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.member.seravision3.day20210722.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class MainTest {
	public static void main(String[] arg) {
		/*
		 * Seravision3 w = new Seravision3();
		 * 
		 * w.getMail(); w.getCompName(); w.getDepartName();
		 */
//		Gerbugi g = new Gerbugi();
//		g.getMail();
//		g.getCompName();
//		g.getDepartName();
//		g.getId();

		Seravision3 seravision3 = new Seravision3();
		Seravision3.desc();
		String id = seravision3.getId();

		
		id = "[" + id + "]" + 1111;

		System.out.println(id);

		Seravision3 s = new Seravision3();
		String pos = s.getPosition();
		System.out.println(pos);
		Withpd w = new Withpd();
//		String pos2 = w.getPosition();
//		System.out.println(pos2);

	}
}
