package com.practice.jpa;

import com.practice.jpa.entity.*;
import com.practice.jpa.repository.StudentRepository;
import com.practice.jpa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	Logger  log= LoggerFactory.getLogger(SpringDataJpaApplication.class);

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ONE TO ONE mapping
//		Student student=new Student();
//		student.setName("ankith");
//		student.setAbout("i am software engineer");
//		Laptop laptop=new Laptop();
//		laptop.setBrand("DELL");
//		laptop.setPrice("50000");
//		student.setLaptop(laptop);
//		Student s = studentRepository.save(student);
//		log.info("student-> {} laptop-> {}",s.getName(),s.getLaptop().getBrand());

//		ONE TO MANY
//		Student student = new Student();
//		student.setName("sumith");
//		student.setAbout("i am software developer");
//		Laptop laptop = new Laptop();
//		laptop.setBrand("mac m1");
//		laptop.setPrice("92000");
//		student.setLaptop(laptop);
//		Course course1=new Course();
//		course1.setName("core java");
//		course1.setPrice("4000");
//		course1.setStudent(student);
//		Course course2=new Course();
//		course2.setName("spring framework");
//		course2.setPrice("8000");
//		course2.setStudent(student);
//		student.setCourses(List.of(course1,course2));
//		Student s = studentRepository.save(student);
//		log.info("student-> {} laptop-> {}", s.getName(), s.getLaptop().getBrand());
//		s.getCourses().forEach(course -> {
//			log.info("courses {}",course.getName());
//		});

//		MANY TO MANY
		User u1=new User();
		u1.setId(1);
		u1.setName("jeevan");

		User u2=new User();
		u2.setId(2);
		u2.setName("pavan");

		User u3=new User();
		u3.setId(3);
		u3.setName("tim");

		Role r1=new Role();
		r1.setId(1);
		r1.setName("admin");

		Role r2=new Role();
		r2.setId(2);
		r2.setName("user");

		u1.setRoles(List.of(r1,r2));

		u2.setRoles(List.of(r1));

		u3.setRoles(List.of(r2));

		userRepository.save(u1);
		userRepository.save(u2);
		userRepository.save(u3);


	}
}
