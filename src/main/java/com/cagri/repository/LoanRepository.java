package com.cagri.repository;

import com.cagri.entity.Book;
import com.cagri.entity.Loan;
import com.cagri.utility.DataBase;

import java.util.ArrayList;

public class LoanRepository {
    public void save(Loan loan){
        DataBase.loanList.add(loan);
    }

    public void delete(int index){
        DataBase.loanList.remove(index);

    }

    public ArrayList<Loan> findAll () {
        return DataBase.loanList;
    }
}
