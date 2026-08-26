package org.example.jpahibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_phone")
public class Phone {
    @Id
    private int id;
    private String name;
    private String price;
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Phone(int id, String name, String price, Employee employee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.employee = employee;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", employee=" + employee +
                '}';
    }
}
