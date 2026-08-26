package org.example.jpahibernate.Repo;

import org.example.jpahibernate.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
