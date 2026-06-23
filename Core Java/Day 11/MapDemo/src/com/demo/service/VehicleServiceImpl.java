package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService{

	private VehicleDao vdao;

	public VehicleServiceImpl() {
		vdao = new VehicleDaoImpl();
	}

	@Override
	public List<Vehicle> getAll() {
		return vdao.findAll();
	}

	@Override
	public boolean addNewVehicle() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the vid");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm= sc.next();
		System.out.println("enter model");
		String model= sc.next();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter the date (dd/MM/yyyy)");
		String date=sc.next();
		LocalDate ldt= LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
		return vdao.save(new Vehicle(id,nm,price,model,ldt));
	}

	@Override
	public boolean deleteById(int id) {
		
		return vdao.removeById(id);
	}

	@Override
	public boolean modifyById(int id, double np) {
		
		return vdao.updateById(id,np);
	}

	@Override
	public Vehicle getById(int id) {
		
				return vdao.findById(id);
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		
		return vdao.findByName(nm);
	}

	@Override
	public Map<Integer, Vehicle> sortById() {
		
		return vdao.sortById();
	}

	@Override
	public List<Vehicle> sortByName() {
		
		return vdao.sortByName();
	}

	@Override
	public List<Vehicle> sortByPrice() {
		
		
		
		return vdao.sortByPrice();
	}

	@Override
	public List<Vehicle> getByPrice(double pr) {
		return vdao.findByPrice(pr);
	}
	
}
