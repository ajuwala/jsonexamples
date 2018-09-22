package com.codebrew.examples;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Address {
    private String street;
    @JsonInclude(JsonInclude.Include.NON_NULL) private String aptSuite;
    private String city;
    private String state;
    private String zip;

    public Address() {
    }

    public Address(String street, String city, String state, String zip) {
        this(street, null, city, state, zip);
    }

    public Address(String street, String aptSuite, String city, String state, String zip) {
        this.street = street;
        this.aptSuite = aptSuite;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptSuite() {
        return aptSuite;
    }

    public void setAptSuite(String aptSuite) {
        this.aptSuite = aptSuite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
