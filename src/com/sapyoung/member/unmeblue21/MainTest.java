package com.sapyoung.member.unmeblue21;

import com.sapyoung.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.seoulite80.day20210720.Seoulite80;
import com.sapyoung.unmeblue21.day20210720.Unmeblue21;

public class MainTest {
	String str = new String("str");
	
	String s = "d";	
	
	public static void main(String[] arg) {
		Unmeblue21 un = new Unmeblue21();
		un.getName();
		un.getCompName();
		un.getCompTel();
		
		Gerbugi g = new Gerbugi();
		g.getName();
		g.getPosition();
		g.getCompName();
		g.getId();
		
		Seoulite80 s = new Seoulite80();
		s.getName();
		s.getPosition();
		s.getId();
		
	}
}
