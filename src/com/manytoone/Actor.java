package com.manytoone;

public class Actor {
	
	private int aid;
	private String aname;
	
	
	
	public Actor(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	

}
