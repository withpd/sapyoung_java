package com.sapyoung.member.clara.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

public class Main extends Company {	           //���
	
	public Main(int i) {
		// TODO Auto-generated constructor stub
	}

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public Main(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
//		UserDto dto1 = new UserDto(5, "��Ÿ");
//		UserDto dto2 = new UserDto();          //���� ������ �� �� 1, 2 ����
//		String r111 = dto1.getResult();
//		System.out.println(r111);
//		
//		Main m = new Main();                   //��ӹ޾� �� ������ ȣ�� 
//		m.getCompName();
//		m.getCompSite();
//		m.getCompTel();
		
		Main m = new Main("3");
		Main m1 = new Main();           // Aȸ��
		Main m2 = new Main(3);			// Cȸ��
		Main m3 = new Main("��ȸ���");	// Bȸ��
		String comName = m.getCompName();
		System.out.println("ȸ���̸� : " + comName);
	}
		
		//������ ȣ���� �Ķ���� �����ϱ�
	
//		public Main() {
//			System.out.println("Main �⺻������");
//		}
//		public Main(String str) {
//			super(3);         //super = Company -> super() -> Company() & super(3) -> Company(3)
//				System.out.println("Main ������ #1");
//		}		
//		public Main(int num) {
//				System.out.println("Main ������ #2");
		}
//	}

