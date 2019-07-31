package com.lm.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    public void findCar (int i) {
        System.out.println("car:" + i);
    }
}
