package org.example.jpahibernate.Repo;

import org.example.jpahibernate.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
