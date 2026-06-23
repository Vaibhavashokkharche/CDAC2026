package com.demo.dao;

import java.util.List;

import com.demo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle v);

	List<Vehicle> getAll();

}
