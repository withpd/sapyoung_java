package com.sapyoung.member.ecodooly8;

/*import com.sapyoung.member.Gerbugi.day20210720.*;
import com.sapyoung.member.ecodooly8.day20210719.*;*/
import com.sapyoung.member.ecodooly8.day20210722.*;

public class MainTest {
	String str = new String("str");
	
	String s = "d";
	
	public static void main(String [] arg) {

//		Ecodooly8 e = new Ecodooly8();
//		e.getMail();
//		e.getCompName();
//		e.getDepartName();
	
		/*
		 * Gerbugi g = new Gerbugi(); g.getCompName(); g.getName(); g.getId();
		 */
	Ecodooly8 ecodooly8 = new Ecodooly8();
	ecodooly8.desc();
	ecodooly8.getDepartName();
	String id = ecodooly8.getId();
	System.out.println(id);
	}
	
}


