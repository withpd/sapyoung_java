package com.sapyoung.member.seoulite80.day20210727;

import com.sapyoung.dto.UserDto;

public class Main {
	public static void main(String[] args) {
		
		// �⺻ ������ X
		UserDto dto1 = new UserDto(4);
		String de = dto1.getDepartName();
		int f = dto1.getFloor();
		System.out.println(f + "��");
		System.out.println(de);
		
		/* �⺻ ������ ����
 		 * UserDto dto = new UserDto();

		 * dto.setName("������"); dto.setDepartName("��ī����"); dto.setFloor(4);
		 * dto.setPos("����"); dto.setMail("hklim@sapyoung.com");
		 * 
		 * String name = dto.getName(); String pos = dto.getPos();
		 * 
		 * String result = pos + " " + name; System.out.println(result);
		 * System.out.println(dto.getMail());
		 */
		
	}
}
