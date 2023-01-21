package com.practice;

import com.practice.config.AppConfig;
import com.practice.dto.DemoBean;
import com.practice.dto.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //creating the application context for getting beans
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student bean = context.getBean(Student.class);
        bean.studying();
        DemoBean bean1 = context.getBean(DemoBean.class);
        bean1.demo();
    }
}
