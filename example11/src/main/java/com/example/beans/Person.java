package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public String name = "Lucy";

//    @Autowired // with (required = false) even if bean is not available Spring will work
    public Vehicle vehicle;     // field cannot be marked as final in cases of field and setter injection

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person bean is created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
