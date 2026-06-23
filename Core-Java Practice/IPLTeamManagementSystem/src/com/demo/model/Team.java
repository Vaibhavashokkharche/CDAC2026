package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private int tid;
	private String tname;
	private String cname;
	private List<Player> players;

	public Team() {
		super();
	}

	public Team(int tid, String tname, String cname, List<Player> players) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.cname = cname;
		this.players = new ArrayList<>();
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", cname=" + cname + ", players=" + players + "]";
	}

}
