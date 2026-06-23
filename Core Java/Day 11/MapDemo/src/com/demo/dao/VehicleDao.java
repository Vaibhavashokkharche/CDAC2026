package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.model.Vehicle;

public interface VehicleDao {

	List<Vehicle> findAll();

	boolean save(Vehicle vehicle);

	boolean removeById(int id);

	boolean updateById(int id, double np);

	Vehicle findById(int id);

	List<Vehicle> findByName(String nm);

	Map<Integer, Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

	List<Vehicle> findByPrice(double pr);

}
