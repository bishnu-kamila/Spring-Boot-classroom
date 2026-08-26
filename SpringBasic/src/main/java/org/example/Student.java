package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("1")
    private int regdNo;
    @Value("Akshay")
    private String name;
    @Autowired
    private Address address;

    public int getRegdNo() {
        return regdNo;
    }

    public void setRegdNo(int regdNo) {
        this.regdNo = regdNo;
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

    public Student(int regdNo, String name, Address address) {
        this.regdNo = regdNo;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "regdNo=" + regdNo +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
