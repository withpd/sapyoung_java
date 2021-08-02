package com.sapyoung.member.allende8505.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.histoyw.day20210726.Histoyw;
import com.sapyoung.member.imachiri.day20210726.Imachiri;
import com.sapyoung.member.peepstest.day20210726.Peepstest;
import com.sapyoung.member.rtyou.day20210726.Rtyou;
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
		if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		} else if(id.equals("withpd")) {
			Withpd w = new Withpd();
			result = w.getMail();
		} else if(id.equals("histoyw")) {
			Histoyw h = new Histoyw();
			result = h.getMail();
		} else if(id.equals("imachiri")) {
			Imachiri I = new Imachiri();
			result = I.getMail();
		} else if(id.equals("peepstest")) {
			Peepstest p = new Peepstest();
			result = p.getMail();
		} else if(id.equals("rtyou")) {
			Rtyou r = new Rtyou();
			result = r.getMail();
		} else {
			result = "¾øÀ½";
		}
		return result;
	}
	
}