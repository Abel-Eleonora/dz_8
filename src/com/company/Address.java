package com.company;

public class Address {

    private  String city;
    private  String street;
    private  int id;

    public Address (String city, String street, int id){
        this.city = city;
        this.street = street;
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getId() { return id; }
}
