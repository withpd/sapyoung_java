package com.sapyoung.member.imachiri.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>(); 
		intList.add(1);
		intList.add(-1);
		intList.add(3);
		intList.add(15);
		intList.add(70);

//		int num = intList.get(1);
//		System.out.println(num);
		//get(��ȣ)�� �� ��° ���� ���������� ��Ÿ���� ����. ���������� �ڹٿ��� 0�� ù ��°�̹Ƿ� 1�� 2�����̴�. 
		//���� �� ���� �ٿ��� System.out.println(intList.get(1)); ��� �ص� �ȴ�.
		
		// �������� ù ��° �׸�(a���� 0), a�� ��ü ����Ʈ�� �ִ� �׸� ��(size)���� �۴�. a���� 1�� Ŀ����(++)
		for(int a = 0; a < intList.size(); a++) {
			System.out.println(intList.get(a));
		}
		
		
	}
}

 