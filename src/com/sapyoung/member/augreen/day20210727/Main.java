package com.sapyoung.member.augreen.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		 
		// �⺻ ������ x
		UserDto dto = new UserDto(4);
		String de = dto.getDepartName();
		int f = dto.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		/*
		 * //�⺻ ������ ���� dto.setName("���Ͽ�"); dto.setDepartName("��ī����"); dto.setFloor(4);
		 * dto.setId("augreen"); dto.setPos("��ǥ"); dto.setMail("augreen@hanmail.net");
		 * 
		 * String name = dto.getName(); String pos = dto.getPos();
		 * 
		 * String result = pos + " " + name; System.out.println(result);
		 * System.out.println(dto.getMail());
		 */
	}
	
} 
