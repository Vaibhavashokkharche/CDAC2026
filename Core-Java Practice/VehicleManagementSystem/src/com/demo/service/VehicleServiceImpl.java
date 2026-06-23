package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
     private VehicleDao vdao;
     
     public VehicleServiceImpl() {
      vdao=new VehicleDaoImpl();
    	 
    	 
     }
  
     
     
     
     
     
     
	@Override
	public boolean addNewVehicle() {
		// Vehicle(int id, String vname, double price)
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String vname=sc.next();
		System.out.println("enter a price");
		double price=sc.nextDouble();
		Vehicle v = new Vehicle(id,vname,price);
		
		return vdao.save(v);
	}







	@Override
	public List<Vehicle> getAll() {
		
		return vdao.getAll();
	}

	
	

}
