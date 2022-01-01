package com.example.biuropodrozyapi.models;

import org.springframework.data.annotation.Id;

public class PersonalData {
    private String firstName;
    private String lastName;
    private String numberPhone;
    private String idCard;
    private String city;
    private String street;
    private String apartamentName;
    private String postCode;

    public PersonalData(String firstName, String lastName, String numberPhone, String idCard, String city, String street, String apartamentName, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.idCard = idCard;
        this.city = city;
        this.street = street;
        this.apartamentName = apartamentName;
        this.postCode = postCode;
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

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartamentName() {
        return apartamentName;
    }

    public void setApartamentName(String apartamentName) {
        this.apartamentName = apartamentName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
