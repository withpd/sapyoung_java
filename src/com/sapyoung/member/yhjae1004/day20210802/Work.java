package com.sapyoung.member.yhjae1004.day20210802;

import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.smjhsh.day20210726.Smjhsh;
import com.sapyoung.member.withpd.day20210726.Withpd;
import com.sapyoung.member.yhjae1004.day20210726.Yhjae1004;
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
		if( id.equals("yhjae1004") ) {
			Yhjae1004 y = new Yhjae1004();
			result = y.getMail();
		} else if ( id.equals("withpd") ) {
			Withpd w = new Withpd();
			result = w.getMail();
		} else if ( id.equals("augreen") ) {
			Augreen a = new Augreen();
			result = a.getMail();
		} else if ( id.equals("smjhsh") ) {
			Smjhsh s = new Smjhsh();
			result = s.getMail();
		} else if ( id.equals("ysb0807") ) {
			Ysb0807 s = new Ysb0807();
			result = s.getMail();
		} else {
			result = "¾øÀ½";
		}
		return result;
	}
	
	public static void main(String[] args) {
		
	}
}



