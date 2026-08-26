package org.example.jpahibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop_data")
public class Laptop {
    @Id
    private int lapId;
    private String modelName;
    private String price;
    @ManyToOne
    @JoinColumn(name = "id")
    private Student student;

    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop(int lapId, String modelName, String price, Student student) {
        this.lapId = lapId;
        this.modelName = modelName;
        this.price = price;
        this.student = student;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lapId=" + lapId +
                ", modelName='" + modelName + '\'' +
                ", price='" + price + '\'' +
                ", student=" + student +
                '}';
    }
}
