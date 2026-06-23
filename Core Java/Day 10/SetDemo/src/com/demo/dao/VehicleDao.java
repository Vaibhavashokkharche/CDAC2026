package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleDao {

	Set<Vehicle> findAll();

	boolean save(Vehicle vehicle);

	Vehicle findById(int id);

	boolean removeById(int id);

	boolean updatById(int id, double newPrice);

	List<Vehicle> findByPrice(double pr);

	Set<Vehicle> sortById();

	List<Vehicle> sortByPrice();

	List<Vehicle> sortByName();

}
