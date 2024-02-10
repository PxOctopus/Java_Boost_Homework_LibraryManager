package com.cagri.repository;

import com.cagri.entity.Customer;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public interface ICustomerRepository {
    public void save(Customer customer);

    public void delete(int index);

    public ArrayList<Customer> findAll ();
}
