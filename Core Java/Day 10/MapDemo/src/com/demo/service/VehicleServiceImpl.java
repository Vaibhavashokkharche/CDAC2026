package com.demo.service;

import java.util.List;

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
	
}
