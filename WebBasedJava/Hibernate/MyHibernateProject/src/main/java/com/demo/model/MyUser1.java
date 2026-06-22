package com.demo.model;

public class MyUser1 {
	private int uid;
	private String uname;
	private String mobile;
	private String email;

	public MyUser1() {
		super();
	}

	public MyUser1(int uid, String uname, String mobile, String email) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mobile = mobile;
		this.email = email;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MyUser1 [uid=" + uid + ", uname=" + uname + ", mobile=" + mobile + ", email=" + email + "]";
	}

}
