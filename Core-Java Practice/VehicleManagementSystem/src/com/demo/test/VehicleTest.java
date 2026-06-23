package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Vehicle;
import com.demo.service.VehicleService;
import com.demo.service.VehicleServiceImpl;

public class VehicleTest {
	public static void main(String[] args) {
		VehicleService vservice=new VehicleServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.add new vehicle\n2.delete vehicle\n3.modify vehicle price\n4.displayall\nchoice");
			choice = sc.nextInt();
			switch (choice) {

			case 1 -> {
				boolean status =vservice.addNewVehicle();
				System.out.println(status?"Vehicle added":"Not added");
			}
			case 2 -> {
			}
			case 3 -> {
			}
			case 4 -> {
			List<Vehicle>list=vservice.getAll();
			for(Vehicle v:list) {
				System.out.println(v);
				
			}
			}
			default -> {
			}

			}

		} while (choice != 4);

	}
}
