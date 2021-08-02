package com.sapyoung.member.unmeblue21.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.ecodooly8.day20210726.Ecodooly8;
import com.sapyoung.member.heejung.day20210726.Heejung;
import com.sapyoung.member.unmeblue21.day20210726.Unmeblue21;

public class Work extends WorkAb{

	private String id;
		
	@Override
	public void init(String id) {
		this.id = id;
	}

	@Override
	public String process() {

		String result;
		
		if(id.equals("unmeblue21")) {
			Unmeblue21 u = new Unmeblue21();
			u.getMail();
			result = u.getMail();
		} else if (id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		} else if (id.equals("augreen")) {
			Augreen au = new Augreen();
			result = au.getMail();
		} else if (id.equals("ecodooly8")) {
			Ecodooly8 e = new Ecodooly8();
			result = e.getMail();	
		} else if (id.equals("heejung")) {
			Heejung h = new Heejung();
			result = h.getMail();	
		} else {
			result = "¾øÀ½";
		}
			
		return result;
	}
	
	public static void main(String[] args) {
				
	}
	
}		
	