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
			result = "����";
		
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
///*�������̽� ����Ϸ��� ���ø���Ʈ�� ������. ���� ���� ��ũ Ŭ�������� ��ũ���� �������̽� ����.
// * ��ó�� ���� �Ŀ� �����ٿ� ���ٴ�� add unimplements��� �ϸ� �Ʒ� �������̵�� ��.  
// * �������̽��� �߻� �޽�常 Ȯ�ΰ����ϴϱ� �̷� �� �������̵��ϴٶ�� ���� �ϴ� �κ��� ���� x
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
	


