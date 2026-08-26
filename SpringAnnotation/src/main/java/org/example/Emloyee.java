package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emloyee {
    @Value("1001")
    private int empId;
    @Value("Dharmendra")
    private String name;
    @Autowired
    private Address address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emloyee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public Emloyee() {
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
