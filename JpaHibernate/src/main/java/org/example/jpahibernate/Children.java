package org.example.jpahibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Children {
    @Id
    private int regdNo;
    private String name;
    @ManyToMany(mappedBy = "children")
    private List<Teacher> teacher;

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

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public Children(int regdNo, String name, List<Teacher> teacher) {
        this.regdNo = regdNo;
        this.name = name;
        this.teacher = teacher;
    }

    public Children() {
    }

    @Override
    public String toString() {
        return "Children{" +
                "regdNo=" + regdNo +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
