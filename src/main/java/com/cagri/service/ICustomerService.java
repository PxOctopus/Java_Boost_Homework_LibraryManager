package com.cagri.service;

import com.cagri.entity.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    public void save(Customer customer);

    public void delete(int index);

    public ArrayList<Customer> findAll();
}
