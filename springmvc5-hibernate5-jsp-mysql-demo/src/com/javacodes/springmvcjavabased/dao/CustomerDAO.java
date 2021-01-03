package com.javacodes.springmvcjavabased.dao;

import java.util.List;

import com.javacodes.springmvcjavabased.model.Customer;

public interface CustomerDAO {
	
	public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
