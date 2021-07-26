package com.sapyoung.member.rtyou.day20210726;

public class RtyouVo {

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
	//this는 본인이 만든 id vo 클래스를 지칭하고, 그 밑으로 가서 호출한다는 의미. 간접적으로 사용. 
	
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

	
////	public static void main(String[] args) {
////		UserVo vo = new UseVo();
////		vo,setDepartNmae("기타");

		
		
//	}
	
}
