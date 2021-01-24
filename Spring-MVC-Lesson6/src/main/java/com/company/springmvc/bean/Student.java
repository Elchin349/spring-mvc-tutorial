package com.company.springmvc.bean;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private Map<String,String> countryOptions;
    private String []  operatingSystem;

    public Student(String firstName, String lastName, String country, String favoriteLanguage, String[] operatingSystem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.operatingSystem = operatingSystem;
    }

    public Student() {
        countryOptions = new HashMap<>();
        countryOptions.put("AZ","AZERBAIJAN");
        countryOptions.put("TR","TURKEY");
        countryOptions.put("US","UNITED STATES OF AMERICA");
        countryOptions.put("RU","RUSSIA");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(Map<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
