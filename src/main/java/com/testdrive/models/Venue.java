package com.testdrive.models;

public class Venue extends Entity {

    private String city;
    private String state;
    private String zipCode;

    public Venue() {
        super();
    }

    public Venue(String name, String city, String state, String zipCode) {
        super(name);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
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

