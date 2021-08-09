package com.sapyoung.member.histoyw.day20210802;

import com.sapyoung.member.Gerbugi.day20210726.Gerbugi;
import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.clara.day20210721.Clara;
import com.sapyoung.member.cswmil.day20210726.Cswmil;
import com.sapyoung.member.ecodooly8.day20210726.Ecodooly8;
import com.sapyoung.member.heejung.day20210726.Heejung;
import com.sapyoung.member.histoyw.day20210726.Histoyw;
import com.sapyoung.member.hooni7777.day20210726.Hooni7777;
import com.sapyoung.member.imachiri.day20210726.Imachiri;
import com.sapyoung.member.peepstest.day20210726.Peepstest;
import com.sapyoung.member.pigglet97.day20210726.Pigglet97;
import com.sapyoung.member.rtyou.day20210726.Rtyou;

public class Work extends WorkAb{
	
	private String id;

	@Override
	public void init(String id) {
		this.id = id;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String process() {
		String result;
		if(id.equals("histoyw")) {
			Histoyw h = new Histoyw();
			result = h.getMail();
			
		}
		
		else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		}
		else if(id.equals("augreen")) {
			Augreen a2 = new Augreen();
			result = a2.getMail();
		}else if(id.equals("ecodooly8")) {
			Ecodooly8 e = new Ecodooly8();
			result = e.getMail();
		}else if(id.equals("gerbugi")) {
			Gerbugi g = new Gerbugi();
			result = g.getMail();
		}else if(id.equals("heejung")) {
			Heejung h2 = new Heejung();
			result = h2.getMail();
		}else if(id.equals("hooni7777")) {
			Hooni7777 h3 = new Hooni7777();
			result = h3.getMail();
		}else if(id.equals("imachiri")) {
			Imachiri i = new Imachiri();
			result = i.getMail();
		}else if(id.equals("peepstest")) {
			Peepstest p = new Peepstest();
			result = p.getMail();
		}else if(id.equals("pigglet97")) {
			Pigglet97 p2 = new Pigglet97();
			result = p2.getMail();
		}else if(id.equals("rtyou")) {
			Rtyou r = new Rtyou();
			result = r.getMail();
		}
		else {
			result = "¾øÀ½";
		}
		
		// TODO Auto-generated method stub
		return result;
	}

	public static void main(String[] args) {
		
	}

}
