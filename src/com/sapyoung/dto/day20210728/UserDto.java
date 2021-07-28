package com.sapyoung.dto.day20210728;

import com.sapyoung.company.Company;

public class UserDto {
	private String id;
	private String mail;
	private int floor;
	private String name;
	private String departName;
	private String pos;
	private String result;
	private Company com;
	
	
	public Company getCom() {
		return com;
	}

	// 기본 생성자
	public UserDto() {
		com = new Company();
	}					
	
	// 일반 생성자 #2
	public UserDto(int floor) {
		
		setFloor(floor);
		
		if(floor == 2) setDepartName("어린이사업부");
		else if(floor == 3) setDepartName("개발팀");
		else if(floor == 4) setDepartName("아카데미");
		else setDepartName("경영");
		result = "floor : " + getFloor() + ", departName : " + getDepartName();
		
		
		/*
		 *  2층 : 어린이사업부
		 *  3층 : 개발팀
		 *  4층 : 아카데미
		 *  5층 : 경영
		 */
	}
	
	// 일반 생성자 #2
	public UserDto(int floor, String departName) {
		setFloor(floor);
		setDepartName(departName);
		
		Company com = new Company();
		String comName = com.getCompName();
		String comTel = com.getCompTel();
		
		result = "floor : " + getFloor() + ", departName : " + getDepartName() + "\n";
		result += comName + ", "+ comTel;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName() {
		System.out.println("");
	}
	
	public void setName(int num) {
		System.out.println("");
	}
	
	public void setName(int num, String str) {
		System.out.println("");
	}
	
	public String getDepartName() {
		return departName;
	}
	
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	public String getPos() {
		return pos;
	}
	
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	public String getResult() {
		return result;
	}
}
