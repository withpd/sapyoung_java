package com.sapyoung.member.unmeblue21.day20210805;

import java.util.ArrayList;

import com.sapyoung.dto.UserDto;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<UserDto> dtoList = new ArrayList<>();
		
		UserDto dto1 = new UserDto();
			dto1.setName("�嵿��");
			dto1.setPos("�ֿ�");
		UserDto dto2 = new UserDto();
			dto2.setName("��ҿ�");
			dto2.setPos("����");
		UserDto dto3 = new UserDto();
			dto3.setName("���켺");
			dto3.setPos("�ܿ�");
		UserDto dto4 = new UserDto();
			dto4.setName("���켺");
			dto4.setPos("ī�޿�");
		
		dtoList.add(dto1);
		dtoList.add(dto2);	
		dtoList.add(dto3);	
		dtoList.add(dto4);
		
		System.out.println(dtoList);

// ArrayList�� ���� ����� �� ��������, DB�� �ʹ� ���� ���� �ٿ�ȴ�. 
// ������ �����͸� ���� �鿩�ٺ��� �����̱� �����̴�. 
// �׷��� "Ű"��� ������ ������ �����ϴ� ���� ����. 
		
		int cnt=0;
		String name = null; 
		String condition="����������";
	
		for(int b=0; b<dtoList.size(); b++) {
			UserDto dto = dtoList.get(b);
			name = dto.getName();
			
			if(name.equals(condition)) {
				cnt++;
			}
		}
		if(cnt !=1) {
		System.out.println(condition + " ���� " + cnt + "���̿���.");		
		} else {
			System.out.println(condition+" ���� 1���̿���.");
		}
	}
}
