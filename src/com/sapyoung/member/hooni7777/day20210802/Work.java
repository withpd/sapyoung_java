package com.sapyoung.member.hooni7777.day20210802;

import com.sapyoung.member.Gerbugi.day20210726.Gerbugi;
import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.hooni7777.day20210726.Hooni7777;
import com.sapyoung.member.smjhsh.day20210726.Smjhsh;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Work extends WorkAb {

	private String id;
	
	@Override
	public void init(String id) {
		this.id = id;
	}

	@Override
	public String process() {
		String result;
		if(id.equals("hooni7777")) {
			Hooni7777 h = new Hooni7777(); 
			result = h.getMail();
		} else if(id.equals("Gerbugi")) {
			Gerbugi g = new Gerbugi();
			result = g.getMail();
		} else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		} else if(id.equals("withpd")) {
			Withpd w = new Withpd();
			result = w.getMail();	
		} else if(id.equals("smjhsh")) {
			Smjhsh s = new Smjhsh();
			result = s.getMail();	
		} else {
			result = "¾øÀ½";
		}
		
		return result;
	}
	public static void main(String[] args) {
		
	}	
	
}
