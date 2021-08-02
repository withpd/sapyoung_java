package com.sapyoung.member.seravision3.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.cswmil.day20210726.Cswmil;
import com.sapyoung.member.ecodooly8.day20210726.Ecodooly8;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.member.seravision3.day20210726.Seravision3;
public class Work extends WorkAb{
	
	private String id;

	@Override
	public void init(String id) {
		this.id =id;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String process() {
		String result;
		if(id.equals("withpd")) {
			Withpd w = new Withpd();
			result= w.getMail();
		}
		
		else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		}
		
		else if(id.equals("augreen")) {
		    Augreen b = new Augreen();
			result = b.getMail();
		}
		
		else if(id.equals("ecodooly8")) {
		Ecodooly8 c = new Ecodooly8();
			result = c.getMail();
		}
		else if(id.equals("cswmil")) {
			Cswmil d = new Cswmil();
			result = d.getMail();
		}
        else if(id.equals("seravision3")) {
			Seravision3 d = new Seravision3();
			result = d.getMail();		
		}
        else {
        	 result="¾øÀ½";
        }
			
		return result;
	}

	 public static void main(String[] args) {
		}
}

	

