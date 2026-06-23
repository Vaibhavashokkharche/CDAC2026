package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.SalariedEmp;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
public class EmployeeServiceImpl implements EmployeeService{
              private EmployeeDao edao;

			  public EmployeeServiceImpl() {
				
				this.edao = new EmployeeDaoImpl();
			  }

			  @Override
			  public boolean addNewEmployee(int ch) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enetr id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String nm=sc.next();
				System.out.println("enter mob");
				String mob=sc.next();
				System.out.println("enter dept");
				String dept=sc.next();
				System.out.println("enter desg");
				String desg=sc.next();
				Employee e=null;
				if(ch==1) {
					System.out.println("enter salary");
					double s=sc.nextDouble();
					 e=new SalariedEmp(id,nm,mob,dept,desg,s);
					
				}else if(ch==2) {
					System.out.println("enter hrs");
					float hrs=sc.nextFloat();
					System.out.println("enter charges");
					double c=sc.nextDouble();
					 e=new ContractEmp(id,nm,mob,dept,desg,hrs,c);
					
				}else if(ch==3) {
					///add code for vendor
				}
				return edao.save(e);
				
			  }

			  @Override
			  public List<Employee> getAll() {
				return edao.findAll();
			  }

			  @Override
			  public Employee getById(int id) {
				return edao.findById(id);
			  }

			  @Override
			  public List<Employee> getByName(String nm) {
				   return edao.findByName(nm);
			  }

			  @Override
			  public boolean deleteById(int id) {
				return edao.removeById(id);
			  }

			  @Override
			  public boolean updateById(int id, double s) {
				return edao.modifySalById(id,s);
			  }

			  @Override
			  public List<Employee> sortById() {
				return edao.sortById();
			  }

			  @Override
			  public List<Employee> sortByName() {
				return edao.sortByName();
			  }

			  @Override
			  public List<Employee> sortBySalary() {
				return edao.sortBySalary();
			  }
              
}
