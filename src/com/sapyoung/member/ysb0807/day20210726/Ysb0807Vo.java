package com.sapyoung.member.ysb0807.day20210726;

public class Ysb0807Vo {
	
	private String id;
	private String mail;
	private String floor;
	private String name;
	private String departName;
	private String pos;
	
	
	
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
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public static void main(String[] args) {
		Ysb0807Vo vo = new Ysb0807Vo();
		vo.setDepartName("±‚≈∏");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
