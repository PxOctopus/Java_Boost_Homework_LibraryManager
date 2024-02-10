package com.cagri.repository;

import com.cagri.entity.Rental;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public interface IRentalRepository {
    public void save(Rental rent);

    public void delete(int index);

    public ArrayList<Rental> findAll ();
}
