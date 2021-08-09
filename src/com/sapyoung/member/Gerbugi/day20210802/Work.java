package com.sapyoung.member.Gerbugi.day20210802;

import com.sapyoung.member.Gerbugi.day20210726.Gerbugi;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.smjhsh.day20210726.Smjhsh;
import com.sapyoung.member.rtyou.day20210726.Rtyou;

public class Work extends WorkAb {
	
	public String id;

	@Override
	public void init(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public String process() {
		// TODO Auto-generated method stub
		String result;
		if(id.equals("Gerbugi")) {
			Gerbugi g = new Gerbugi();
			result = g.getMail();
		} else if(id.equals("withpd")) {
			Withpd w = new Withpd();
			result = w.getMail();
		} else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		} else if(id.equals("smjhsh")) {
			Smjhsh s = new Smjhsh();
			result = s.getMail();
		} else if(id.equals("rtyou")) {
			Rtyou r = new Rtyou();
			result = r.getMail();
		} else {
			result = "¾øÀ½";
		}
		
		return result;
	}

	public static void main(String[] args) {
		
	}
	
}
