package com.sapyoung.member.imachiri;

/*import com.sapyoung.member.Gerbugi.day20210720.*;
import com.sapyoung.member.imachiri.day20210720.*;*/
import com.sapyoung.member.imachiri.day20210722.Imachiri;

public class MainTest {

	public static void main(String[] arg) {
	
		/*
		 * Imachiri i = new Imachiri(); i.getMail(); i.getPosition(); i.getId();
		 * i.getDepartname();
		 * 
		 * String name = i.getName(); String pos = i.getPosition();
		 * 
		 * System.out.println(name + " " + pos);
		 */	
	
		/*
		 * Gerbugi g = new Gerbugi(); g.getCompName(); g.getCompTel(); g.getId();
		 */
		
	Imachiri imachiri = new Imachiri();
	imachiri.desc();
	String id = imachiri.getId();
	id = "[" + id + "]";
	System.out.println(id);
	
		
	}

}
