package com.sapyoung.member.imachiri.day20210726;


// Vo란? DB에서 가져온 데이터를 저장해 둠. setter와 getter를 통해 DB속의 정보에 간접적으로 접근 가능.

public class ImachiriVo {
	
      private String id;
      private String mail;
      private String floor;
      private String name;
      private String departname;
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
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
		// 자바 문법에서 this는 해당 변수가 사용된 클래스를 지칭함.
	}
	
	
	
	
	
	
	
	
	
}
