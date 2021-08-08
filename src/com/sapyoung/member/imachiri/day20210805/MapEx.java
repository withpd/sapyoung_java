package com.sapyoung.member.imachiri.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapEx {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		// K = key(������Ÿ�� ������ �� ��° ���������� Ű�� ��������. Array List�� �˾Ƽ� ������ ���������� �ؽø��� ���� ���������) , V = value
		HashMap<String, UserDto> map = new HashMap<>();
		
			UserDto dto1 = new UserDto();
			dto1.setName("�Ȱ���");
			dto1.setPos("����1");

			UserDto dto2 = new UserDto();
			dto2.setName("������");
			dto2.setPos("����2");
		
			UserDto dto3 = new UserDto();
			dto3.setName("������");
			dto3.setPos("����3");

			UserDto dto4 = new UserDto();
			dto4.setName("�̼���");
			dto4.setPos("����4");
		
			UserDto dto5 = new UserDto();
			dto5.setName("���4");
			dto5.setPos("����4");		
			
			map.put("imachiri", dto1); //ù ��° �ִ� dto1 �̶�� ��
			map.put("Gerbugi", dto2);
			map.put("ecodooly8", dto3);
			map.put("peepstest", dto4);
			map.put("seoulite80", dto5);
	
			UserDto dto = map.get("imachiri");
		
			// iterator�� �ݺ��� & hashmap���� ������ ���� ������ ������� �����ϰ� ���´�. 
			Iterator<String> iter = map.keySet().iterator();
				while (iter.hasNext()) {
					String key = iter.next();
					System.out.println(key);
				}	
	}	
}	

