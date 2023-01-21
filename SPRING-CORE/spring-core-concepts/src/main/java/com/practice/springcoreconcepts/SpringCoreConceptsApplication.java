package com.practice.springcoreconcepts;

import com.practice.springcoreconcepts.beanscope.Person;
import com.practice.springcoreconcepts.lifecycle.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		//bean scope
//		Person bean1 = context.getBean(Person.class);
//		System.out.println(bean1);
//		bean1.walk();
//		Person bean2 = context.getBean(Person.class);
//		System.out.println(bean2);
//		bean2.walk();
//		Person bean3 = context.getBean(Person.class);
//		System.out.println(bean3);
//		bean3.walk();

		//bean proxy
//		Person person1=context.getBean(Person.class);
//		System.out.println(person1);
//		System.out.println(person1.getAddress());
//		Person person2=context.getBean((Person.class));
//		System.out.println(person2);
//		System.out.println(person2.getAddress());

		//lifecycle
		Student bean = context.getBean(Student.class);
		System.out.println(bean.getName());

	}

}
