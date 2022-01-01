package com.example.biuropodrozyapi.dto;

public class BookedTripDTO {
    String idTrip;
    private String username;
    private String firstName;
    private String lastName;
    private String numberPhone;
    private String idCard;
    private String city;
    private String street;
    private String apartamentName;
    private String postCode;

    public BookedTripDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(String idTrip) {
        this.idTrip = idTrip;
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
