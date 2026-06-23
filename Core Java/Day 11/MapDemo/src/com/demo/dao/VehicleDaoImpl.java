package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
		//convert the map into list
		List<Vehicle> vlst = new ArrayList<Vehicle>();
		for (Integer k : vmap.keySet()) {
			vlst.add(vmap.get(k));
		}
		// return (List<Vehicle>) vmap.values();
		return vlst;
	}

	@Override
	public boolean save(Vehicle vehicle) {
		//check if key not found, then add the new vehicle
		if (!vmap.containsKey(vehicle.getId())) {
			vmap.put(vehicle.getId(), vehicle);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		//remove will remove object if found and return value of the key, else return null
		Vehicle v = vmap.remove(id);
		if (v != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(int id, double np) {
		  //retrieve value by using key id
		Vehicle v = vmap.get(id);
		if (v != null) {
			//change the price if found
			v.setPrice(np);
			return true;
		}

		return false;
	}

	@Override
	public Vehicle findById(int id) {
        //retrieve value by using key id
		return vmap.get(id);
	}

	@Override
	public List<Vehicle> findByName(String nm) {
		List<Vehicle> vlist = new ArrayList<>();
		//navigate through map using keySet
		for (Integer k : vmap.keySet()) {
			Vehicle v = vmap.get(k);
			if (v.getVname().equals(nm)) {
				vlist.add(v);
			}

		}
		if(vlist.size()>0) {
			return vlist;
		}
		
		return null;
	}

	@Override
	public List<Vehicle> findByPrice(double pr) {
		List<Vehicle> vlist=new ArrayList<>();
		for(Integer k:vmap.keySet()) {
			Vehicle v=vmap.get(k);
			if(v.getPrice()>pr) {
				vlist.add(v);
			}
		}
		return vlist;
	}
	@Override
	public Map<Integer, Vehicle> sortById() {
		Map<Integer, Vehicle> tm= new TreeMap<>();
		//navigate through map using entrySet
		for(Map.Entry<Integer, Vehicle> entry:vmap.entrySet()) {
			tm.put(entry.getKey(), entry.getValue());
			
		}
		
		return tm;
	}

	@Override
	public List<Vehicle> sortByName() {
		List<Vehicle> vlist=findAll();
		//if we pass null to sort method then it uses Comparable 
		vlist.sort(null);
		return vlist;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		Comparator<Vehicle> cp= (o1,o2)->{
			return (int) (o1.getPrice()-o2.getPrice());
		};
		List<Vehicle> vlist=findAll();
		//It will use comparator based on price
		vlist.sort(cp);
		
		return vlist;
	}

	

}
