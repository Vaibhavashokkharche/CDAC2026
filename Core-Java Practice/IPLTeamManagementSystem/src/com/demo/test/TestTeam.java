package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.model.Team;
import com.demo.service.TeamService;
import com.demo.service.TeamServiceImpl;

public class TestTeam {


	public static void main(String[] args) {
		TeamService tservice = new TeamServiceImpl();
		// Team(int tid, String tname, String cname, List<String> players) {
		// Team t=new Team(101,"India","Rohit",playera)
		int choice = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"1:Add new team\n2:Delete team by id\n3:Delete a player from team\n4:DispalyAllBatsman\n5:Display all the user with speciality\n6:addnewPlayerinTeam\n7:Modify Coarch of team\n8:Exit\n Enter a choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				boolean status=tservice.addNewTeam();
			}
			case 2 -> {
			}
			case 3 -> {
			}
			case 4 -> {
			}
			case 5 -> {
			}
			case 6 -> {
			}
			case 7 -> {
			}
			case 8 -> {
			}
			default -> {
				sc.close();
				System.out.println("oppss wrong choice!!!!!!");
			}

			}
		} while (choice != 8);

	}

}
