package com.sapyoung.member.rtyou.day20210726;

import com.sapyoung.company.Company;
import com.sapyoung.member.peepstest.day20210720.Peepstest;
import com.sapyoung.member.seravision3.day20210721.Seravision3;
import com.sapyoung.member.withpd.day20210726.Withpd;

public class Rtyou {
	// ���� ����(local variable)�� ���� ����: �����̴ϱ� ���� ���� �ִ� ��ǻ�� ������ ���� ������. 

	//���̵�ϱ� ���� �ʿ����. set�� ȣ���ϴ� ������ ���� ���ϴ� ���� � ���� �ְڴٴ� �ǹ�. 
	//set�� get�� �ݴ���. ���� ������ �ʿ���. 
	
	private String pos;
	private String mail;
	private String id;
	private String floor;
	private String departName;
	
	public void setPosition(String position) {
		pos = position;
			}
	
	public String getPosition() {		
		return pos;
		
	}
	
	
	public String getName() {
		String name = "�ִٿ�";
		return name;
	}	
	
	
	
	public int getFloor() {
		int floor = 2;
		return floor;
		
	}
	
	
	public String getDepartName() {
		String depart ="������";
		return depart;

	}


	public String getMail() {
		String mail ="rosa@sapyoung.com";
		return mail;

	}

	public void desc() {
		System.out.println("���� ���縦 ����ϴ�.");

	}
	


	public String getId() {
		String className = getClass().getSimpleName();
		System.out.println(className);
		return className;

	}
	
	
	
	
	public static void main(String[] args) {
		//���α׷� ����
		Rtyou r = new Rtyou();		
		Withpd w = new Withpd();
		
		r.pos = "1111";
		String pos = r.getPosition();
		System.out.println(pos);
		
	
//		String pos = w.getPosition();
//		System.out.println(pos);
		
		//��ó�� ���� �ʴ� ������ �����ڰ� ������ �����ϱ� ����. 
		
//		r. setPosition("�븮");
//		String posBefore = r.getPosition();
//		System.out.println("BEFORE : " + posBefore);
//		
//		r. setPosition("����");
//		�߰��� �������� �̿��ؼ� ���������� �������� �ٲ��ֱ� ������ ���� �븮, ������ �������� ����. VO��� ��
//					
//		String pos = r.getPosition();
//		String posAfter = r.getPosition();
//		System.out.println("AFTER :" + posAfter);
//		
//		System.out.println(pos);
		//���� �� �����ǿ��� �ѱ� �� ����̰�, �� r�� �� �����ǿ��� ���� ��. 
		// ���� �����ε� String ������ �� �����ǿ� �븮�� �ϰ� �־ �ۿ�. 
		
		
		
		//���α׷� ����
	
	}
	
	

}
