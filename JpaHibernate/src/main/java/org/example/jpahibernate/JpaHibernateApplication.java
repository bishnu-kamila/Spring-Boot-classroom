package org.example.jpahibernate;

import org.example.jpahibernate.Repo.EmployeeRepository;
import org.example.jpahibernate.Repo.PhoneRepository;
import org.example.jpahibernate.Repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JpaHibernateApplication {
    @Autowired
    public EmployeeRepository employeeRepository;
    @Autowired
    private PhoneRepository phoneRepository;

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(JpaHibernateApplication.class, args);
        EmployeeRepository employeeRepository1= context.getBean(EmployeeRepository.class);
        PhoneRepository phoneRepository1 = context.getBean(PhoneRepository.class);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setName("Abhay");
        employee.setAddress("Bbsr");

        Phone phone = new Phone();
        phone.setId(101);
        phone.setName("Oppo");
        phone.setPrice("34999");
        phone.setEmployee(employee);

        phoneRepository1.save(phone);
        employee.setPhone(phone);
        employeeRepository1.save(employee);

        Student student = new Student();
        student.setId(1);
        student.setName("Kartik");
        student.setAddress("Bls");

        Laptop laptop = new Laptop();
        laptop.setLapId(101);
        laptop.setModelName("HpPavilion");
        laptop.setPrice("68000");
        laptop.setStudent(student);

        Laptop laptop1 = new Laptop();
        laptop1.setLapId(102);
        laptop1.setModelName("AsusTUF");
        laptop1.setPrice("52000");
        laptop1.setStudent(student);

        student.setLaptop(List.of(laptop, laptop1));

        studentRepository.save(student);

    }

}
