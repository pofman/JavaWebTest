package com.testdrive.models;

public class Venue extends Entity {

    private String city;
    private String state;
    private String zipCode;

    public Venue(String name, String city, String state, String zipCode) {
        super(name);
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}

