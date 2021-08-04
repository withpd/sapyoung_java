package com.sapyoung.member.seoulite80.day20210802;

import com.sapyoung.member.allende8505.day20210722.Allende8505;
import com.sapyoung.member.augreen.day20210722.Augreen;
import com.sapyoung.member.heejung.day20210722.Heejung;
import com.sapyoung.member.seoulite80.day20210722.Seoulite80;

public class Work extends WorkAb {
	
	private String id;

	@Override
	public void init(String id) {
		this.id = id;
	}

	@Override
	public String process() {
		String result;
		if(id.equals("seoulite80")) {
			Seoulite80 s = new Seoulite80();
			result = s.getMail();		
		} else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		} else if(id.equals("augreen")) {
			Augreen a = new Augreen();
			result = a.getMail();
		} else if(id.equals("heejung")) {
			Heejung h = new Heejung();
			result = h.getMail();
		} else {
			result = "¾øÀ½";
		}
		return result;
	}


}
