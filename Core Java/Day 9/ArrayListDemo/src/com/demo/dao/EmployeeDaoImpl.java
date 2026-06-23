package com.demo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.comparators.EmployeeNameComparator;
import com.demo.comparators.EmployeeSalComparator;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
             static List<Employee> elist;
             static {
            	 elist=new ArrayList<>();
            	 elist.add(new SalariedEmp(12,"Rajesh","4444","Hr","mgr",45678));
            	 elist.add(new ContractEmp(13,"Rajani","55555","admin","asst",45,6666));
            	 elist.add(new SalariedEmp(14,"Rajesh","4444","Hr","mgr",45678));
            	 elist.add(new ContractEmp(15,"Meenal","6666","admin","asst",45,6766));
             }
			 @Override
			 //add a object in the list at the end
			 public boolean save(Employee e) {
				return elist.add(e);
				
			 }
			 @Override
			 public List<Employee> findAll() {
				return elist;
			 }
			 @Override
			 public Employee findById(int id) {
				 int pos=elist.indexOf(new SalariedEmp(id) );
				 if(pos!=-1) {
					 return elist.get(pos);
				 }
				 return null;
			 }
			 @Override
			 public List<Employee> findByName(String nm) {
				//java 1.7 
				/* List<Employee> lst=new ArrayList<>();
				 Iterator<Employee> it=elist.iterator();
				 while(it.hasNext()) {
					 Employee e=it.next();
					 if(e.getPname().equals(nm)) {
						 lst.add(e);
					 }
				 }
				*/
				 //java 1.7 
				/* List<Employee> lst=new ArrayList<>();
				 for(Employee e: elist) {
					 if(e.getPname().equals(nm)) {
						   ast.add(e);
					 }
				 }*/
				 
				 ///java 1.8 using stream function
				 List<Employee> lst=elist.stream()
						 .filter(e->e.getPname().equals(nm))
						 .collect(Collectors.toList());
				 if(lst.size()>0) {
					 return lst;
				 }else {
					 return null;
				 }
				 
				 
				 
				 
			 }
			 @Override
			 public boolean removeById(int id) {
				/*Iterator<Employee> it=elist.iterator();
				while(it.hasNext()) {
					Employee e=it.next();
					if(e.getPid()==id) {
						it.remove();
						return true;
					}
				}
				return false;*/
				/* int pos=elist.indexOf(new SalariedEmp(id));
				 if(pos!=-1) {
				       elist.remove(pos);
				 }*/
				// elist.removeIf(e->e.getPname().equals(nm));
				return elist.remove(new SalariedEmp(id));
			 }
			 @Override
			 public boolean modifySalById(int id, double s) {
				Employee e=findById(id);
				if(e!=null) {
					if(e instanceof SalariedEmp) {
						((SalariedEmp)e).setSal(s);
					}else if(e instanceof ContractEmp) {
						((ContractEmp)e).setCharges(s);
					}else {
						//vendor check
					}
					return true;
				}
				return false;
			 }
			 @Override
			 public List<Employee> sortById() {
				 //create a copy of existing list
				List<Employee> elst=new ArrayList<>();
				for(Employee e:elist) {
					elst.add(e);
				}
				elst.sort(null);
				return elst;
			 }
			 @Override
			 public List<Employee> sortByName() {
				 //create a copy of existing list
					List<Employee> elst=new ArrayList<>();
					for(Employee e:elist) {
						elst.add(e);
					}
					elst.sort(new EmployeeNameComparator());
					return elst;
			 }
			 @Override
			 public List<Employee> sortBySalary() {
				 List<Employee> elst=new ArrayList<>();
					for(Employee e:elist) {
						elst.add(e);
					}
					elst.sort(new EmployeeSalComparator());
					return elst;
			 }
}
