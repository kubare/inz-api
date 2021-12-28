package com.example.biuropodrozyapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Document(collection = "trip")
public class Trip {
    // @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private String _id;
    private String country;
    private String city;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String transport;
    private String description;
    private Integer maxPersons;
    private Integer hotelStars;
    private Integer price;
    private String img;
    private String type;

    public Trip(String _id, String country, String city, LocalDate dateFrom, LocalDate dateTo, String transport, String description, Integer maxPersons, Integer hotelStars, Integer price, String img, String type) {
        this._id = _id;
        this.country = country;
        this.city = city;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.transport = transport;
        this.description = description;
        this.maxPersons = maxPersons;
        this.hotelStars = hotelStars;
        this.price = price;
        this.img = img;
        this.type = type;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxPersons() {
        return maxPersons;
    }

    public void setMaxPersons(Integer maxPersons) {
        this.maxPersons = maxPersons;
    }

    public Integer getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(Integer hotelStars) {
        this.hotelStars = hotelStars;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
