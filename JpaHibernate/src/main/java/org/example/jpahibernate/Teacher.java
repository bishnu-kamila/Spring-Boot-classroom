package org.example.jpahibernate;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Teacher {
    @Id
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(name = "teacher_children",
    joinColumns = @JoinColumn(name = "teacher_id"),
    inverseJoinColumns = @JoinColumn(name = "children_id"))
    private List<Children> children;

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

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public Teacher(int id, String name, List<Children> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
