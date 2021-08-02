// ������ ��Ű���� ctrl + n -> Work��� �̸��� �Ϲ� Ŭ���� �����
// �Ϲ� Ŭ�������� �������̽���� �������� ����� �� WorkIf�� ����(implements)�ؾ��Ѵ�. 

package com.sapyoung.member.imachiri.day20210802;

import com.sapyoung.member.allende8505.day20210726.Allende8505;
import com.sapyoung.member.imachiri.day20210726.Imachiri;
import com.sapyoung.member.ecodooly8.day20210726.Ecodooly8;
import com.sapyoung.member.hooni7777.day20210726.Hooni7777;
import com.sapyoung.member.peepstest.day20210726.Peepstest;
import com.sapyoung.member.pigglet97.day20210726.Pigglet97;

public class Work extends WorkAb{
		//���� ��Ű�� �ȿ� �ִ� �������̽��̹Ƿ� ���� import ���ص� ��.
		   //���� �� ����ٸ� Ŭ���ؼ� add unimplemented methods ���� -> �������̽� �� �߻� �޼ҵ带
		   //�������̵�(�������̽����� �״�� ����� �߻� �޼ҵ��� �����ϴ� ����)�Ѵ�. //�ݸ�, �߻� Ŭ������ ��� ���� ���, ��ӵ� ���뿡
		   //�����Ӱ� ������ �� ����. (��Ӱ� ������ ������)
		
		private String id;
		// ���� Dto���� ������� id ���� �������   
			
		@Override
		public void init(String id) {
			this.id = id;
		}

		@Override
		public String process() {
			String result; // if�� �ۿ��� ������� ���� ����(string)�� ������ ������ ���� �Ʒ����� ������ string�̶�� ���� �ʿ� ����. 
			
			if(id.equals("imachiri")) {
		//��ȣ�� 2���� '����'��� ��. ��, ���ڿ��� �ش��ϰ� ��Ʈ��Ÿ��(����Ÿ��)�� ���ٰ� ���� �ʹٸ� ��ħǥ(period)�� ���� equals �޼ҵ带 ��� ��.
				Imachiri i = new Imachiri();
				result = i.getMail();
			} 
			
			else if(id.equals("allende8505")) {
				Allende8505  a = new Allende8505();
				result = a.getMail();
			}
			
			else if(id.equals("ecodooly8")) {
				Ecodooly8  e = new Ecodooly8();
				result = e.getMail();
			}
				
			else if(id.equals("hooni7777")) {
				Hooni7777  h = new Hooni7777();
				result = h.getMail();
			}
				
			else if(id.equals("peepstest")) {
				Peepstest  p = new Peepstest();
				result = p.getMail();
			}
			
			else if(id.equals("pigglet97")) {
				Pigglet97  l = new Pigglet97();
				result = l.getMail();
			}
			
			else {
				result = "����";
			}
			
			return result;
		}


			
		} 
 
 
 
