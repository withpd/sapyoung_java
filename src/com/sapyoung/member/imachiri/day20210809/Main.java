package com.sapyoung.member.imachiri.day20210809;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
			//LinkedHashMap�� ��� �ؽø��� �������� �ʰ�, ������� �����ϰ� ���ִ� �ڵ��
		    //Ű�� �� �ڷ� �ش� Ű���� ���� ����, �ڿ��� ���� ��� ������ ���Ե� ä�� �����Ͱ� �迭�Ǿ��ִ� ���̶�� �� �� ����.
			LinkedHashMap<String, String> map = new LinkedHashMap<>();
			map.put("key15", "value1");
			map.put("key2", "value2");
			map.put("key38", "value3");
			map.put("key400", "value4");

			Iterator<String> iter = map.keySet().iterator();
			
			// for, while���� �ݺ������μ� �Ȱ��� ������ �ݺ��ϰ� ����� ������.
			while(iter.hasNext()) {
				String key = iter.next();
				System.out.println(key);
				
			}
	}
}
		