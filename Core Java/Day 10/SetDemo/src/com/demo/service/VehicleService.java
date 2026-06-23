package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleService {

	Set<Vehicle> getAll();

	boolean addNewVehicle();

	Vehicle getById(int id);

	boolean deleteById(int id);

	boolean modifyById(int id, double newPrice);

	List<Vehicle> getByPrice(double pr);

	Set<Vehicle> sortById();

	List<Vehicle> sortByPrice();

	List<Vehicle> sortByName();

}
