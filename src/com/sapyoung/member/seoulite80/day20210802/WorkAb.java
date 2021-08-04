package com.sapyoung.member.seoulite80.day20210802;

// 상속 가능

public abstract class WorkAb implements WorkIf {
	public String getResult() {
		String val = process();
		return val;
	}
}
