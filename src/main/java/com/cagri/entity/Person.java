package com.cagri.entity;

import java.util.UUID;

public abstract class Person {
    private int id;
    private String username;
    private String password;
    private String address;
    private String phoneNo;
    static int count = 0;

    // P. CONSTRUCTOR //
    public Person(int id, String username, String password, String address, String phoneNo) {
        count++;
        if (id==-1){
            id = count;
        }else{
            this.id = id;
        }

        this.username = username;
        this.password = password;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public Person(int id, String username, String address, String phoneNo) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.phoneNo = phoneNo;
    }
// GETTER & SETTER //


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static void setRentalNumber(int rentalNumber) {
        Person.count = rentalNumber;
    }

    // INFO //
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
