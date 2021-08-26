package com.sapyoung.member.rtyou.day20210805;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sapyoung.dto.UserDto;

public class MapExam {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		
		HashMap<String, UserDto> map = new HashMap<>();
		
		UserDto dto1 =new UserDto();
		dto1.setName("�輺ȣ");
		dto1.setPos("����");
		
		UserDto dto2 =new UserDto();
		dto2.setName("���2");
		dto2.setPos("����");
		
		UserDto dto3 =new UserDto();
		dto3.setName("���3");
		dto3.setPos("����");
		
		UserDto dto4 =new UserDto();
		dto4.setName("���4");
		dto4.setPos("������");
		
		UserDto dto5 =new UserDto();
		dto5.setName("���5");
		dto5.setPos("����5");
		
		map.put("withpd", dto1);   //�� ����
		map.put("a", dto2);
		map.put("b", dto3);
		map.put("c", dto4);
		map.put("d", dto5);
		
//		UserDto dto = map.get("a");
//		System.out.println(dto.getName());
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key =iter.next();
			UserDto dto = map.get(key);
			System.out.println(key +":" + dto.getName());
			
		}
		
		
	}
	// �� , Ű�� ��� , Ű�� ����� ã�� ��Ʈ�� ��� ���� ���� ���, ���� Ű�� �˾ƾ���  
}	// �ʰ� ��� ����Ʈ ����. ������ ���� ������ Ư¡�� ������ ��� �ʿ�. ��̴� ��, ���� ����� �����Ϳ��� �Ⱦ�
