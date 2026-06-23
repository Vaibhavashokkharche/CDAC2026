package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService{
           private VehicleDao vdao;

		   public VehicleServiceImpl() {
			super();
			this.vdao = new VehicleDaoImpl();
		   }

		   @Override
		   public Set<Vehicle> getAll() {
			return vdao.findAll();
		   }

		   @Override
		   public boolean addNewVehicle() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr vehicle id");
			int vid = sc.nextInt();
			System.out.println("Enter vehicle name");
			String vname = sc.next();
			System.out.println("Enter price");
			double price = sc.nextDouble();
			System.out.println("Enter model");
			String model = sc.next();
			System.out.println("Enter date (dd/mm/yyyy)");
			String date = sc.next();
			LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			return vdao.save(new Vehicle(vid, vname, price, model,ldt));
			
		   }

		   @Override
		   public Vehicle getById(int id) {
			// TODO Auto-generated method stub
			   return vdao.findById(id);
			
		   }

		   @Override
		   public boolean deleteById(int id) {
			// TODO Auto-generated method stub
			return vdao.removeById(id);
		   }

		   @Override
		   public boolean modifyById(int id, double newPrice) {
			// TODO Auto-generated method stub
			return vdao.updatById(id,newPrice);
		   }

		   @Override
		   public List<Vehicle> getByPrice(double pr) {
			// TODO Auto-generated method stub
			   
			return vdao.findByPrice(pr);
		   }

		   @Override
		   public Set<Vehicle> sortById() {
			return vdao.sortById();
			}

		   @Override
		   public List<Vehicle> sortByPrice() {
			return vdao.sortByPrice();
		   }

		   @Override
		   public List<Vehicle> sortByName() {
			return vdao.sortByName();
		   }
			
		   
           
}
