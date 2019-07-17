package com.lm.demo;

import com.lm.demo.entity.Man;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("bean.xml");
        Man man = classPathXmlApplicationContext.getBean(Man.class);
        man.driveCar();
        //SpringApplication.run(DemoApplication.class, args);
    }

}
