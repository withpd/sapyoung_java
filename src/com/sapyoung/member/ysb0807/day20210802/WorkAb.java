package com.sapyoung.member.ysb0807.day20210802;

public abstract class WorkAb implements WorkIf{

	public String getResult() {
		String val = process();
		return val; 
	}
}
