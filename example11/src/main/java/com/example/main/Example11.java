package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Example11 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);


        System.out.println("Person Name from Spring context is : " + person.getName());
        System.out.println("Vehicle Name from Spring context is : " + vehicle.getName());

        System.out.println("Vehicle that person own is : " + person.getVehicle());
    }
}
