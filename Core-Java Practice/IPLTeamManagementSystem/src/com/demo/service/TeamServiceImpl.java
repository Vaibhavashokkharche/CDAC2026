package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.model.Player;
import com.demo.model.Team;

public class TeamServiceImpl implements TeamService {

	@Override
	public boolean addNewTeam() {
		Scanner sc = new Scanner(System.in);
		// public Team(int tid, String tname, String cname, List<String> players)
		// Player(int pid, String pname, String speciality)
		System.out.println("enter id");
		int tid = sc.nextInt();
		System.out.println("enter team name ");
		String tname = sc.next();
		System.out.println("enter coach name");
		String cname = sc.next();
		List<Player> plist = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			System.out.println("enter the pid");
			int id = sc.nextInt();
			System.out.println("enter player name");
			String pname = sc.next();
			System.out.println("enter speciality");
			String speciality = sc.next();

			plist.add(new Player(id, pname, speciality));

		}
             Team team= new Team(tid,tname,cname,plist);
		return false;
	}

}
