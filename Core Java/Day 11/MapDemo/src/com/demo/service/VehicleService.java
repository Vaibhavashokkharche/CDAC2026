package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.model.Vehicle;

public interface VehicleService {

	List<Vehicle> getAll();

	boolean addNewVehicle();

	boolean deleteById(int id);

	boolean modifyById(int id, double np);

	Vehicle getById(int id);

	List<Vehicle> getByName(String nm);

	Map<Integer, Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

	List<Vehicle> getByPrice(double pr);

}
