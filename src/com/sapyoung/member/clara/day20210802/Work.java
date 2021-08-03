package com.sapyoung.member.clara.day20210802;

import com.sapyoung.member.Gerbugi.day20210726.Gerbugi;
import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.clara.day20210720.Clara;
import com.sapyoung.member.rtyou.day20210726.Rtyou;
import com.sapyoung.member.smjhsh.day20210726.Smjhsh;

public class Work extends WorkAb {
	
	private String id;
	
	@Override
	public void init(String id) {
		this.id = id;
	}

	@Override
	public String process() {
		String result;
		
		if(id.equals("clara")) {
			Clara w = new Clara();
			w.getMail();
		}
		
		if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
					
		} else if(id.equals("Gerbugi")) {
			Gerbugi g = new Gerbugi();
			result = g.getMail();
		
		} else if(id.equals("smjhsh")) {
			Smjhsh s = new Smjhsh();
			result = s.getMail();
			
		} else if(id.equals("rtyou")) {
			Rtyou r = new Rtyou();
			result = r.getMail();
			
		} else	{
			result = "¾øÀ½";
			
		}
		return result;
	}

	

	

}
