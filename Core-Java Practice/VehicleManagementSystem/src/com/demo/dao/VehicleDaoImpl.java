package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
  static List<Vehicle> vlist;
  
  static {
	  vlist= new ArrayList<>();
	  vlist.add(new Vehicle(11,"Hyundai",800000));
	  vlist.add(new Vehicle(12,"MarutiSuzuki",750000));
	  
  }

@Override
public boolean save(Vehicle v) {
	vlist.add(v);
	return true;
}

@Override
public List<Vehicle> getAll() {
	
	return vlist;
}
	
	
	
	
	
	
	
	

}
