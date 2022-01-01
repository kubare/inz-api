package com.example.biuropodrozyapi.dto;

public class BookResponseDTO {
    private String idBook;
    private String idTrip;
    private String country;
    private String username;
    private String firstName;
    private String lastName;
    private String numberPhone;
    private String idCard;
    private String city;
    private String street;
    private String apartamentName;
    private String postCode;

    public BookResponseDTO() {
    }

    public BookResponseDTO(String idBook, String idTrip, String username, String firstName, String lastName, String numberPhone, String idCard, String city, String street, String apartamentName, String postCode) {
        this.idBook = idBook;
        this.idTrip = idTrip;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.idCard = idCard;
        this.city = city;
        this.street = street;
        this.apartamentName = apartamentName;
        this.postCode = postCode;
    }

    public BookResponseDTO(String idBook, String idTrip, String country, String username, String firstName, String lastName, String numberPhone, String idCard, String city, String street, String apartamentName, String postCode) {
        this.idBook = idBook;
        this.idTrip = idTrip;
        this.country = country;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.idCard = idCard;
        this.city = city;
        this.street = street;
        this.apartamentName = apartamentName;
        this.postCode = postCode;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdTrip() {
        return idTrip;
    }

    public void setIdTrip(String idTrip) {
        this.idTrip = idTrip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
