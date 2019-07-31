package com.lm.demo.config;

import com.lm.demo.entity.Car;
import com.lm.demo.entity.Man;
import com.lm.demo.entity.QQCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//同xml一样描述bean以及bean之间的依赖关系
@Configuration
public class ManConfig {

    @Bean("man")
    public Man man1 () {
        System.out.println("man1");
        return new Man(car());
    }

    @Bean("man")
    public Man man2 () {
        System.out.println("man2");
        return new Man(car());
    }

    @Bean
    public Car car () {
        return new QQCar();
    }

}
