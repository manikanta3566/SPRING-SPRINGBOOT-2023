package config.xml.beans;

import com.practice.dto.DemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
   //creating the xml based application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/xml/config.xml");
        Student student1 = applicationContext.getBean("student1", Student.class);
        student1.hello();

        System.out.println(student1);
        System.out.println(student1.getAddress());

        DemoBean bean = applicationContext.getBean(DemoBean.class);
        bean.demo();

    }
}
