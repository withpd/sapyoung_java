package com.sapyoung.member.seravision3.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.day20210728.UserDto;

public class DtoList {

	public static void main(String[] args) {
    
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto ();
		dto1.setDepartName("��Ÿ");
		dto1.setName("�輼��");
		dto1.setMail("seravision@gmail.com");
		dto1.setPos("����");
		
		UserDto dto2 = new UserDto ();
		dto2.setDepartName("��Ÿ");
		dto2.setName("���Ͽ�");
		dto2.setMail("seravision@gmail.com");
		dto2.setPos("����");
		
	    dtoList.add(dto1);
	    dtoList.add(dto2);
	    
	    int size = dtoList.size();
	    System.out.println(size);
	    
	    boolean isContain = dtoList.contains(dto1);
	    System.out.println(isContain);
	    
	    
	    
	    
		int size1= dtoList.size();
		System.out.println(size1);
		
			if(size1 !=0) {
			UserDto d = dtoList.get(0);
			String name = d.getName();
			System.out.println(name);
			
					
		} else {
		   System.out.println("����Ÿ����");	    
	    
		}	
			
		for(int i=0; i<dtoList.size(); i++)	{
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
			
		
//	    System.out.println("for");
		}
	
	}
	
	
}
