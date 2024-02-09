package com.cagri.repository;

import com.cagri.entity.Customer;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class CustomerRepository {
    public void save(Customer customer){
        DataBase.customerList.add(customer);
    }

    public void delete(int index){
        DataBase.customerList.remove(index);

    }

    public ArrayList<Customer> findAll () {
        return DataBase.customerList;
    }
}
