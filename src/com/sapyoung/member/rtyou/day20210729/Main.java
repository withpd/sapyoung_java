package com.sapyoung.member.rtyou.day20210729;

import com.sapyoung.company.Company;
import com.sapyoung.dto.UserDto;

//��� Ŭ���� ������ �ֿ켱�̰� ��� Ŭ������ ��� ������ �ʴ� ������ �ڵ����� ������ ������Ʈ�� ��ӵȴ�. 

public class Main extends Company { 
	
	public Main() {
		super(); // super = Company -> super() -> Company() super�� ����ϴ� ���� �����ڸ� ����. 
		System.out.println("Main �⺻������");
	}
	public Main(String str) {
		super(str);
		System.out.println("Main ������ #1");
		
	}
	
	public Main(int num) {
		super(num);
		System.out.println("Main ������ #2");
		
	}
	
	
	
	public static void main(String[] args) {
		Main m1= new Main();
		//Main m2 = new Main(3);
		//Main m3 = new Main("3");
		String comName =m1.getCompName();
		System.out.println("ȸ���̸�: " + comName);
		
//		UserDto dto = new UserDto(5,"��Ÿ");
//		String r1111 = dto.getResult();
//		System.out.println(r1111);
//	
	
	
		
		
// ���θ� �����ߴµ� ���д� ������ �ҷ��� �� �ִ� ������ ���۴� Ŭ���� �ؿ� �ִ� ��ü�� ����� ���. ���� �޽��� �⺻�̶������.
// ���дϵ� �⺻�����ڿ� ���� ������ �Ǿ��ٰ� �����ؾ���. 
		
		
	}
	
	
}

// �߻� Ŭ������ ����? Ŭ������ �ְ� �߻� Ŭ������ �ְ� ��� Ŭ����, �������̵�. ......��Ʊ�
// Ŭ���� ��ӵ�. �߻� Ŭ���� ��ӵ�. �������̽� ��� �ȵ�. 
	
