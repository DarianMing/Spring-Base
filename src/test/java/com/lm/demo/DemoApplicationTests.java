package com.lm.demo;

import com.lm.demo.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @Test
//    public void test1() {
//        ProxyFactory proxyFactory = ProxyFactory.getInstance();
//        //创建一个实现了Car接口的对象
//        Car car = new QQCar();
//        //创建一个基于car对象的代理对象
//        Car proxy = proxyFactory.create(car);
//        //调用代理对象的某个方法
//        proxy.driving();
//    }

    @Test
    public void testProxyFactory () {
        CarService carService = new CarService();
        ProxyFactory proxyFactory = new ProxyFactory(carService);
        proxyFactory.addAdvice((MethodBeforeAdvice) (method, args, target) -> {
            System.out.println("执行目标方法调用之前的逻辑");
            //不需要手动去调用目标方法，Spring内置逻辑里面会调用目标方法
        });
        CarService proxy = (CarService) proxyFactory.getProxy();
        proxy.findCar(1);
    }

}
