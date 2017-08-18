package com.manytoone;

public class Movies {
	
	private int mid;
	private String mname;
	private Actor actor;
	
	
	public Movies(int mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public int getMid() {
		return mid;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	

}
