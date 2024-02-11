package com.cagri.service;

import com.cagri.entity.Customer;
import com.cagri.entity.Rental;
import com.cagri.repository.CustomerRepository;
import com.cagri.repository.ICustomerRepository;
import com.cagri.repository.IRentalRepository;
import com.cagri.repository.RentalRepository;

import java.util.ArrayList;

public class RentalService implements IRentalService{
    private IRentalRepository rentalRepository;
    public RentalService(){
        rentalRepository= new RentalRepository();
    }
    public void save(Rental rental) {
        rentalRepository.save(rental);
    }

    public void delete(int index) {
        rentalRepository.delete(index);

    }

    public ArrayList<Rental> findAll() {
        return rentalRepository.findAll();
    }
}
