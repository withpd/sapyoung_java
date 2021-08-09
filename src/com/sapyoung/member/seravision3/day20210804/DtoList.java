package com.sapyoung.member.seravision3.day20210804;

import java.util.ArrayList;

import com.sapyoung.dto.day20210728.UserDto;

public class DtoList {

	public static void main(String[] args) {
    
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto ();
		dto1.setDepartName("기타");
		dto1.setName("김세라");
		dto1.setMail("seravision@gmail.com");
		dto1.setPos("직원");
		
		UserDto dto2 = new UserDto ();
		dto2.setDepartName("기타");
		dto2.setName("이하영");
		dto2.setMail("seravision@gmail.com");
		dto2.setPos("직원");
		
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
		   System.out.println("데이타없음");	    
	    
		}	
			
		for(int i=0; i<dtoList.size(); i++)	{
			UserDto d = dtoList.get(i);
			String name = d.getName();
			System.out.println(name);
			
		
//	    System.out.println("for");
		}
	
	}
	
	
}
