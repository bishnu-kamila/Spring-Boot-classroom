package org.example.jpahibernate.Repo;

import org.example.jpahibernate.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
