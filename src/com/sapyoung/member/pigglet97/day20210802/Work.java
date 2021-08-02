package com.sapyoung.member.pigglet97.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.heejung.day20210726.Heejung;
import com.sapyoung.member.hooni7777.day20210726.Hooni7777;
import com.sapyoung.member.imachiri.day20210726.Imachiri;
import com.sapyoung.member.pigglet97.day20210726.Pigglet97;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.member.ysb0807.day20210726.Ysb0807;

public class Work extends WorkAb {
	
	private String id;
	
	@Override
	public void init(String id) {
		this.id = id;
	}

	@Override
	public String process() {
		
		String result;
		
		if (id.equals("withpd")) {
			Withpd w = new Withpd();
		    result = w.getMail();
		} else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
			
		} else if(id.equals("pigglet97")) {
			Pigglet97 p = new Pigglet97();
			result = p.getMail();
						
		} else if(id.equals("ysb0807")) {
			Ysb0807 y = new Ysb0807();
			result = y.getMail();
			
		} else if(id.equals("heejung")) {
			Heejung h = new Heejung();
			result = h.getMail();
			
		} else if(id.equals("hooni7777")) {
			Hooni7777 o = new Hooni7777();
			result = o.getMail();
			
		} else if(id.equals("augreen")) {
			Augreen n = new Augreen();
			result = n.getMail();
			
		} else if (id.equals("imachiri")) {
			Imachiri i = new Imachiri();
			result =i.getMail();
		} else {
			result = "¾øÀ½";
		
		}
		return result;
	}
		
	public static void main(String[] args) {
		
	}
	


	
}
