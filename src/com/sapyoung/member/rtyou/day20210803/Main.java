package com.sapyoung.member.rtyou.day20210803;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		
		UserDto[] dtoArray = new UserDto[20]; //20���� ���� ���� 
		
		UserDto dto1 = new UserDto(); //1���� ���� ����, �� ��ü�� ������  
		dto1.setDepartName("�μ�1");	
		dto1.setName("�̸�1");
		
		
		UserDto dto2 = new UserDto(); //1���� ���� ����, �� ��ü�� ������  
		dto2.setDepartName("�μ�2");	
		dto2.setName("�̸�3");
		
		UserDto dto3 = new UserDto(); //1���� ���� ����, �� ��ü�� ������  
		dto3.setDepartName("��Ÿ");	
		dto3.setName("�輺ȣ");
			
		
		dtoArray[0] = dto1;
		dtoArray[1] = dto2;
		dtoArray[2] = dto3;

		
		UserDto resDto = dtoArray[1];
		String str = resDto.getName();
		
		System.out.println(str);
		//System.out.println(dtoArray.length);
		
		ArrayList <UserDto> aList = new ArrayList<>();
		aList.add(dto1);  //0��°
		aList.add(dto2);
		aList.add(dto3);
		
		System.out.println(aList.get(0).getName());
		
		System.out.println(aList.size());
		//�� length�� ���� �� 
		
		
//		String[] strArray = new String[7]; //str ������ [] �迭�� 7�� �� ��. 
//		
//			
//		strArray[0] = "��1";  // ����� ���鿡���� 0�������� ���߿����� 0���� ����
//		strArray[1] = "��2";
//		strArray[2] = "��3";
//		strArray[3] = "��4";
//		strArray[4] = "��5";
//		strArray[5] = "��6";
//		strArray[6] = "��7";
		
		
		
	}
}
