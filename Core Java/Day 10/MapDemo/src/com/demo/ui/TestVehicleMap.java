package com.demo.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class TestVehicleMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		VehicleService vservice = new VehicleServiceImpl();
		do {
			System.out.println("1. Add New Vehicle \n 2. Delete By id \n "
					+ "3. Modify Price by Id \n 4. Display All \n 5. Display By Id \n 6. Display By Name \n 7. Display By Price \n"
					+ "8. Sort By Id \n 9. Sort By Name \n 10. Sort By Price \n 11. Exit \n Enter Choice:");
			choice = sc.nextInt();

			
			switch (choice) {
			case 1 -> {

			}
			case 2 -> {

			}
			case 3 -> {

			}
			case 4 -> {
				List<Vehicle> vlist = vservice.getAll();
				vlist.forEach(System.out::println);
			}
			case 5 -> {

			}
			case 6 -> {

			}
			case 7 -> {

			}
			case 8 -> {

			}
			case 9 -> {

			}
			case 10 -> {

			}
			case 11 -> {
				sc.close();
				System.out.println("Thanks for visiting...");
			}
			default -> {
				System.out.println("Invalid Choice!");
			}
			}
		} while (choice != 11);
	}

}
