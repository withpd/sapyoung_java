package com.sapyoung.member.rtyou.day20210805;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
	
		intList.add(10); //0��°
		intList.add(200); //1��°
		intList.add(3000);
		intList.add(40000);
		intList.add(500000);
		
		// int size = intList.size(); �� ����� �� ��� 
		// System.out.println(intList);  �ټ���� �� � ������� 
		
//		int num = intList.get(0); 
//		�� ��� ��. �ϴ� intList.get�� ���� ġȯ�� ��. 
//		System.out.println(intList.get(0));
//		�� ���� ����� �� ��°�� � ������� 
		
		//������ ��Ҹ� ����ϴ� ����� ������ ��ȿ������.  �ݺ��� �̿��ؼ� ���� �� ����
		for(int a = 0; a < intList.size(); a++) {
		System.out.println(intList.get(a));	
		}
			//1�� �ݸ��� �����ŭ ��ġ�� ����, a++�� a�� 1�� ���ϴ°� 
		
	}
	
}
