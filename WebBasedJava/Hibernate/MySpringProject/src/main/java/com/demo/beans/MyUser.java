package com.demo.beans;

public class MyUser {
@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + "]";
	}
public int getUid() {
		return uid;
	}
	public String getUname() {
		return uname;
	}
	public String getMob() {
		return mob;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
private int uid;
private String uname;
private String mob;
public MyUser() {
	super();
	System.out.println("defalut constructor of myuser is called");
}
public MyUser(int uid, String uname, String mob) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.mob = mob;
}


	
	
	
}
