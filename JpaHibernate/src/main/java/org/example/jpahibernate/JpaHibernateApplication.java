package org.example.jpahibernate;

import org.example.jpahibernate.Repo.*;
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

        TeacherRepository teacherRepository = context.getBean(TeacherRepository.class);
        ChildrenRepository childrenRepository = context.getBean(ChildrenRepository.class);
//        Employee employee = new Employee();
//        employee.setEmpId(1);
//        employee.setName("Abhay");
//        employee.setAddress("Bbsr");
//
//        Phone phone = new Phone();
//        phone.setId(101);
//        phone.setName("Oppo");
//        phone.setPrice("34999");
//        phone.setEmployee(employee);
//
//        phoneRepository1.save(phone);
//        employee.setPhone(phone);
//        employeeRepository1.save(employee);
//
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Kartik");
//        student.setAddress("Bls");
//
//        Laptop laptop = new Laptop();
//        laptop.setLapId(101);
//        laptop.setModelName("HpPavilion");
//        laptop.setPrice("68000");
//        laptop.setStudent(student);
//
//        Laptop laptop1 = new Laptop();
//        laptop1.setLapId(102);
//        laptop1.setModelName("AsusTUF");
//        laptop1.setPrice("52000");
//        laptop1.setStudent(student);
//
//        student.setLaptop(List.of(laptop, laptop1));
//
//        studentRepository.save(student);

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Bishnupada Kamila");

        Teacher teacher1 = new Teacher();
        teacher1.setId(2);
        teacher1.setName("Rashmi Ranjan Swain");

        Children children = new Children();
        children.setRegdNo(411);
        children.setName("Pritam");

        Children children1 = new Children();
        children1.setRegdNo(249);
        children1.setName("Nawil");

        Children children2 = new Children();
        children2.setRegdNo(224);
        children2.setName("Soumya");

        List<Children> childrenList = List.of(children2,children1,children);
        childrenRepository.saveAll(childrenList);

        teacher.setChildren(List.of(children,children1));
        teacher1.setChildren(List.of(children1,children2));



        List<Teacher> teacherList = List.of(teacher1,teacher);
        teacherRepository.saveAll(teacherList);



    }

}
