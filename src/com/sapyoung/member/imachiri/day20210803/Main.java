// ������ ����: ���� ���� �����͸� �� ���� ����ϱ�! (�ϳ��ϳ� �����͸� �ڵ�ȭ���� ���ֱ� �����Ƿ�)

package com.sapyoung.member.imachiri.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
// main (string[] args) ��ȣ �� �κ��� �Ķ������. string Ŭ���� �������� - [] �� ��ŭ�� ������ args ������ ó���ϰڴٴ� ��.
		String[] strArray = new String[7];
		// strArray��� ������ 7���� ��Ʈ������ ���� �� �ִ�.
// ���߿��� ���� �� �� �� ù ���� ���ڴ� �׻� 0�̴�. 1�� �ƴ�.
		strArray[0] = "��1";
		strArray[1] = "��2";
		strArray[2] = "��3";
		strArray[3] = "��4";
		strArray[4] = "��5";
		strArray[5] = "��6";
		strArray[6] = "��7";

		System.out.println(strArray[1]);
// ��ü ������ �͵� �߿��� 5���� ���� ����ϰڴٴ� ��.

		UserDto[] dtoArray = new UserDto[20];
		UserDto dto1 = new UserDto();
		dto1.setDepartName("�μ�1");
		dto1.setName("�̸�1");

		UserDto dto2 = new UserDto();
		dto2.setDepartName("�μ�2");
		dto2.setName("�̸�2");

		UserDto dto3 = new UserDto();
		dto3.setDepartName("�μ�3");
		dto3.setName("�̸�3");

		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;

// dtoArray �ȿ� 4���� dtoŬ�������� ������ �� ������.

		UserDto resDto = dtoArray[0]; 
		String str = resDto.getName();
		System.out.println(str);
	 
// ArrayList �� ���� ���� Ŭ������ ���� �� �ִ� Ŭ������.
		ArrayList<UserDto> aList = new ArrayList<>();
		aList.add(dto1);
		aList.add(dto2);
		aList.add(dto3);
		
		aList.get(0).getName();
		System.out.println(aList.get(0).getName());
// ArrayList�� �ټ���� ���. ����Ʈ �ȿ� �� ���� ���� �ִ��� �˰� �ʹٸ� size�޼ҵ� ���.
		
	}

}
