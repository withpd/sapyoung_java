package com.sapyoung.member.augreen.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class DtoList {
	public static void main(String[] args) {	
			ArrayList<UserDto> dtoList = new ArrayList<>();
			
			UserDto dto1 = new UserDto();
			dto1.setDepartName("��ī����");
			dto1.setName("���Ͽ�");
			dto1.setMail("augreen@hanmail.net");
			dto1.setPos("��ǥ");
			
			UserDto dto2 = new UserDto();
			dto2.setDepartName("��Ÿ");
			dto2.setName("�輺ȣ");
			dto2.setMail("withpd@gmail.net");
			dto2.setPos("����");
						
			dtoList.add(dto1);
			dtoList.add(dto2);
			
			int size = dtoList.size();
//			System.out.println(size);
			
			boolean isContain = dtoList.contains(dto1);
//			System.out.println(isContain);
			
			
			
			int size1 = dtoList.size();
//			System.out.println(size1);
			
			if(size1 !=0) {
				UserDto d = dtoList.get(0);
				String name =d.getName();
				System.out.println(name);				
			} else {
//				System.out.println("������ ����");
			}
			
			for(int i=0; i < dtoList.size(); i++) {
				UserDto d = dtoList.get(1);
				String name = d.getName();
				System.out.println(name);
				
				
				
				
//				System.out.println("for");
			}
			
			
			
			
	}

}	
	
	

