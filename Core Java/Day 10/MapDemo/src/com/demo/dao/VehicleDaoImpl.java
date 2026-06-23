package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	static Map<Integer, Vehicle> vmap;
	static {
		vmap = new HashMap<>();
		vmap.put(12, new Vehicle(12, "Activa", 80000, "6G", LocalDate.of(2026, 04, 9)));
		vmap.put(13, new Vehicle(13, "Vespa", 180000, "vG", LocalDate.of(2026, 04, 9)));
		vmap.put(15, new Vehicle(15, "Jupyter", 98000, "jG", LocalDate.of(2026, 04, 9)));
	}

	@Override
	public List<Vehicle> findAll() {
		List<Vehicle> vlst = new ArrayList<Vehicle>();
		for (Integer k : vmap.keySet()) {
			vlst.add(vmap.get(k));
		}
		// return (List<Vehicle>) vmap.values();
		return vlst;
	}

}
