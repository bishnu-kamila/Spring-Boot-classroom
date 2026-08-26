package org.example.jpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

    }

}
