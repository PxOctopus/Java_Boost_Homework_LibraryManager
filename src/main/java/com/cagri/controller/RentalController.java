package com.cagri.controller;

import com.cagri.service.RentalService;
import com.cagri.utility.DataBase;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RentalController implements IRentalController{
    private RentalService rentalService;
    public RentalController(){
        rentalService = new RentalService();
    }


}
