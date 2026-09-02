package org.example.jpahibernate.Repo;

import org.example.jpahibernate.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
