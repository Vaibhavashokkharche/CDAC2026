package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
             static List<Employee> elist;
             static {
            	 elist=new ArrayList<>();
            	 elist.add(new SalariedEmp(12,"Rajesh","4444","Hr","mgr",45678));
            	 elist.add(new ContractEmp(13,"Rajani","55555","admin","asst",45,6666));
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
}
