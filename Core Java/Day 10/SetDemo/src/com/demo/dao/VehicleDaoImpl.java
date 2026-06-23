package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao{
            static Set<Vehicle> vset;
            static {
            	vset=new HashSet<>();
            	vset.add(new Vehicle(12,"Activa",80000,"l1",LocalDate.of(2023,11,23)));
            	vset.add(new Vehicle(13,"Santro",1000000,"sports",LocalDate.of(2023,11,23)));
            	vset.add(new Vehicle(14,"I10",1500000,"Asta",LocalDate.of(2023,11,23)));
            }
			@Override
			public Set<Vehicle> findAll() {
			       return vset;
			}
			@Override
			public boolean save(Vehicle vehicle) {
				// TODO Auto-generated method stub
				return vset.add(vehicle);
				
			}
			@Override
			public Vehicle findById(int id) {
				// TODO Auto-generated method stub
				/*for(Vehicle v:vset) {
					if(v.getVid()==id) {
						return v;
					}
				}*/
				Optional <Vehicle> op=vset.stream().filter(v->v.getVid()==id)
                .findFirst();//terminating function
                return op.orElse(null);
			}
			@Override
			public boolean removeById(int id) {
				// TODO Auto-generated method stub
				return vset.remove(new Vehicle(id));
			}
			@Override
			public boolean updatById(int id, double newPrice) {
				// TODO Auto-generated method stub
				Vehicle v = findById(id);
				if(v != null) {
					v.setPrice(newPrice);
					return true;
				}
				return false;
			}
			@Override
			public List<Vehicle> findByPrice(double pr) {
				// TODO Auto-generated method stub
				List < Vehicle> lst= vset.stream().filter(v->v.getPrice()>pr)
				.collect(Collectors.toList());
				return lst.size()>0?lst:null;
			}
			@Override
			public Set<Vehicle> sortById() {
				Set<Vehicle> tset=new TreeSet<>();
				for(Vehicle v:vset) {
					tset.add(v);
				}
				return tset;
				
			}
			@Override
			public List<Vehicle> sortByPrice() {
				Comparator<Vehicle> cv=(o1,o2)->{
					System.out.println("in price comparator "+o1.getPrice()+"-------"+o2.getPrice());
					return (int)(o1.getPrice()-o2.getPrice());
				};
				List<Vehicle> lst=new ArrayList<>();
				for(Vehicle v:vset) {
					lst.add(v);
				}
				lst.sort(cv);
				return lst;
			}
			@Override
			public List<Vehicle> sortByName() {
				Comparator<Vehicle> cv=(o1,o2)->{
					System.out.println("in name comparator "+o1.getVname()+"-------"+o2.getVname());
					return o1.getVname().compareTo(o2.getVname());
				};
				List<Vehicle> lst=new ArrayList<>();
				for(Vehicle v:vset) {
					lst.add(v);
				}
				lst.sort(cv);
				return lst;
			} 
            
}
