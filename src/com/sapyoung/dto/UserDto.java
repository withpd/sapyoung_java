package com.sapyoung.dto;

public class UserDto {
	private String id;
	private String mail;
	private int floor;
	private String name;
	private String departName;
	private String pos;
	
	public UserDto() {}
	
	public UserDto(int floor) {
		
		setFloor(floor);
		
		if(floor == 2) setDepartName("��̻����");
		else if(floor == 3) setDepartName("������");
		else if(floor == 4) setDepartName("��ī����");
		else setDepartName("�濵");
		
		/*
		 *  2�� : ��̻����
		 *  3�� : ������
		 *  4�� : ��ī����
		 *  5�� : �濵
		 */
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
}
