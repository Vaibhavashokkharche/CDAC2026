package com.demo.beans;

import java.util.List;

public class Customer {
	private int cid;
	private String cname;
	private List<String> addrlist;
	private List<Product> orderlist;

	public Customer() {
		super();
		System.out.println("default contructor of customar class");
	}

	public Customer(int cid, String cname, List<String> addrlist, List<Product> orderlist) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.addrlist = addrlist;
		this.orderlist = orderlist;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public List<String> getAddrlist() {
		return addrlist;
	}

	public List<Product> getOrderlist() {
		return orderlist;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setAddrlist(List<String> addrlist) {
		this.addrlist = addrlist;
	}

	public void setOrderlist(List<Product> orderlist) {
		this.orderlist = orderlist;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", addrlist=" + addrlist + ", orderlist=" + orderlist
				+ "]";
	}

}
