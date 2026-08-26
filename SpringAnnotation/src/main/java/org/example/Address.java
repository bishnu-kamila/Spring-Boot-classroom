package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("1")
    private int id;
    @Value("Jatni")
    private String city;
    @Value("Khurdha")
    private String dist;
    @Value("Odisha")
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(int id, String city, String dist, String state) {
        this.id = id;
        this.city = city;
        this.dist = dist;
        this.state = state;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", dist='" + dist + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
