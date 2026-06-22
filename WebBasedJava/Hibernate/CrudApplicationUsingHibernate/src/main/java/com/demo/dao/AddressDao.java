package com.demo.dao;

import com.demo.model.Address;

public interface AddressDao {

	boolean addNewAddress(Address addr);

	boolean displayByAddress(int aid);

}
