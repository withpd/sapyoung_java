package com.sapyoung.member.rtyou;

import com.sapyoung.member.rtyou.day20210726.Rtyou;
import com.sapyoung.member.rtyou.day20210802.Work;

public class MainTest {
	
	public static void main(String[] arg) {
			Work w =new Work();
			w.init("augreen");
			
			String result = w.getResult();
					
			System.out.println(result);
	
	}	
	
}
