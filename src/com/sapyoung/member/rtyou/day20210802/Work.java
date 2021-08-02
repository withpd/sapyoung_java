package com.sapyoung.member.rtyou.day20210802;

import com.sapyoung.member.Gerbugi.day20210726.Gerbugi;
import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.augreen.day20210726.Augreen;
import com.sapyoung.member.clara.day20210720.Clara;
import com.sapyoung.member.cswmil.day20210726.Cswmil;
import com.sapyoung.member.rtyou.day20210726.Rtyou;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Work extends WorkAb{

	private String id; 
	
	public void init(String id) {
		this.id =id; 
		// TODO Auto-generated method stub
		
	}

	@Override
	public String process() {
		String result; 
		if(id.equals("rtyou")) {
			Rtyou r = new Rtyou();
			result = r.getMail();
		}
		else if(id.equals("withpd")) {
			Withpd w = new Withpd();
			result = w.getMail();
		}
		else if(id.equals("allende8505")) {
			Allende8505 a = new Allende8505();
			result = a.getMail();
		}
		else if(id.equals("augreen")) {
			Augreen u = new Augreen();
			result = u.getMail();
		
		}else if(id.equals("Gerbugi")) {
			Gerbugi g = new Gerbugi();
			result = g.getMail();
		}else if(id.equals("cswmil")) {
			Cswmil c = new Cswmil();
			result = c.getMail();
		}else { 
			result = "없음";
		
		}
		return result;
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void init() {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
	
	
}



//public class Work extends WorkAb{
//
//	@Override
//	public void init() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String process() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public String getResult() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	


//public class Work implements WorkIf{
///*인터페이스 사용하려면 인플리먼트로 선언함. 내가 만든 워크 클래스에서 워크이프 인터페이스 쓰라.
// * 위처럼 선언 후에 빨간줄에 갖다대면 add unimplements라고 하면 아래 오버라이드로 됨.  
// * 인터페이스는 추상 메써드만 확인가능하니까 이럴 때 오버라이드하다라고 용어쓰고 하단 부분은 수정 x
// */
//	@Override
//	public void init() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String process() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getResult() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	


