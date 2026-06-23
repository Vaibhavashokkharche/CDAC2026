package com.demo.service;

import java.util.List;

import com.demo.model.Vehicle;

public interface VehicleService {

	boolean addNewVehicle();

	List<Vehicle> getAll();

}
