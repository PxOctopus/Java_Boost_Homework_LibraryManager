package com.cagri.service;

import com.cagri.entity.Rental;

import java.util.ArrayList;

public interface IRentalService {
    public void save(Rental rental);

    public void delete(int index);

    public ArrayList<Rental> findAll();
}
