package com.example.Springboot_Transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private int streetId;

    private String city;

    // Getters and Setters

    public int getStreetId() {
        return streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method

    @Override
    public String toString() {
        return "Address{" +
                "streetId=" + streetId +
                ", city='" + city + '\'' +
                '}';
    }
}
