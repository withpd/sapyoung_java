package com.sapyoung.member.unmeblue21.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.day20210728.UserDto;

// ������ ���ุ, ��� ������ ������ ���Ͽ���.
// db���� �ڷ� �ҷ����� ����� �ڹٿ��� 'Ű' ���̽㿡�� '��ųʸ�'��� �θ�.


public class Main {
	public static void main(String[] args)  {
		String[] strArray = new String[7];
			
		strArray[0] = "��1";
		strArray[1] = "��2";	
		strArray[2] = "��3";
		strArray[3] = "��4";
		strArray[4] = "��5";
		strArray[5] = "��6";
		strArray[6] = "��7";
		
		System.out.println(strArray[5]);
		
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
		
		UserDto dto4 = new UserDto();
		dto4.setDepartName("�μ�4");
		dto4.setName("�̸�4");
		
		UserDto dto5 = new UserDto();
		dto5.setDepartName("�μ�5");
		dto5.setName("�̸�5");
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;
		dtoArray[3] = dto4;
		dtoArray[4] = dto5;
		
		UserDto resDto = dtoArray[2];
		String str = resDto.getName();
		
		System.out.println(str);
		
		int sss;
		
		ArrayList<UserDto> aList = new ArrayList<>();
		aList.add(dto1);
		aList.add(dto2);		
		aList.add(dto3);
		aList.add(dto4);
		aList.add(dto5);

		System.out.println(aList.size());
		
	}
	
}
