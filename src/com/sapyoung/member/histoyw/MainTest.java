package com.sapyoung.member.histoyw;

//import com.sapyoung.member.Gerbugi.day20210720.Gerbugi;
import com.sapyoung.member.histoyw.day20210722.Histoyw;

public class MainTest {

	public static void main(String[] arg) {

//		Gerbugi g = new Gerbugi();
//		g.getDepartName();
//		g.getName();
//		g.getCompName();

		Histoyw histoyw = new Histoyw();
		histoyw.desc();
		String id = histoyw.getId();
		
		id = "[" + id + "]" + " " + 512;
		
		System.out.println(id);
		
	
	}
	
}
