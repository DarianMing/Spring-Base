package com.lm.demo;

import com.lm.demo.service.CarService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //加载项目中的spring配置文件到容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("resouces/applicationContext.xml");
        //加载系统盘中的配置文件到容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("bean.xml");
        //从容器中获取对象实例
//        Man man = classPathXmlApplicationContext.getBean(Man.class);
//        man.driveCar();
        //从java注解的配置中加载配置到容器
//        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.lm.demo.*");
//        //从容器中获取对象实例
//        Man man = annotationConfigApplicationContext.getBean(Man.class);
//        man.driveCar();
        CarService carService = classPathXmlApplicationContext.getBean(CarService.class);
        carService.findCar(1);
        //SpringApplication.run(DemoApplication.class, args);
    }

}
