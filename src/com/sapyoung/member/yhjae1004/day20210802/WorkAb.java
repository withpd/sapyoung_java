package com.sapyoung.member.yhjae1004.day20210802;

// 상속 가능 (extends)

public abstract class WorkAb implements WorkIf{
	
	public String getResult() {
		String val = process();
		return val;
	}
}
