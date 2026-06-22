package com.demo.service;

import java.util.Scanner;
import java.util.Set;

import com.demo.dao.AddressDao;
import com.demo.dao.AddressDaoImpl;
import com.demo.model.Address;
import com.demo.model.Person;

public class AddressServiceImpl implements AddressService{
	private AddressDao adao;
	public AddressServiceImpl() {
		adao=new AddressDaoImpl();
	}
	

	@Override
	public boolean addNewAddress() {
		Scanner sc = new Scanner(System.in);
		//public Address(int aid, String street, String city, String state, Set<Person> studset)
		System.out.println("enter aid");
		int aid=sc.nextInt();
		System.out.println("enter Street");
		String street= sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter state");
		String state=sc.next();
		
		Address addr= new Address(aid,street,city,state, null);
		
		
		
		return adao.addNewAddress(addr);
	}


	@Override
	public boolean displayAddress(int aid) {
		
		return adao.displayByAddress(aid);
	}



}
