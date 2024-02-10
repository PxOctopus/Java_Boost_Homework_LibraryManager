package com.cagri.repository;

import com.cagri.entity.Rental;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class RentalRepository implements IRentalRepository{
    public void save(Rental rent){
        DataBase.rentalList.add(rent);
    }

    public void delete(int index){
        DataBase.rentalList.remove(index);

    }

    public ArrayList<Rental> findAll () {
        return DataBase.rentalList;
    }
}
