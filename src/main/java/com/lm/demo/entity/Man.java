package com.lm.demo.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Man {

    private Car car;

    public void driveCar () {
        car.driving();
    }

}
